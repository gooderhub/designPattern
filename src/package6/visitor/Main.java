package package6.visitor;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));
            rootdir.accept(new ListVisitor());              

            System.out.println("");
            System.out.println("Making user entries...");
            Directory xiaoming = new Directory("小明");
            Directory xiaohong = new Directory("小红");
            Directory xiaohua = new Directory("小花");
            usrdir.add(xiaoming);
            usrdir.add(xiaohong);
            usrdir.add(xiaohua);
            xiaoming.add(new File("diary.html", 100));
            xiaoming.add(new File("Composite.java", 200));
            xiaohong.add(new File("memo.tex", 300));
            xiaohua.add(new File("game.doc", 400));
            xiaohua.add(new File("junk.mail", 500));
            rootdir.accept(new ListVisitor());              
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
