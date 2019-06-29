package package5.composite;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("创建根目录");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));
            rootdir.printList();

            System.out.println("");
            System.out.println("创建用户目录");
            Directory xiaoming = new Directory("小明");
            Directory xiaohong = new Directory("小红");
            Directory xiaohua = new Directory("小花");
            usrdir.add(xiaoming);
            usrdir.add(xiaohong);
            usrdir.add(xiaohua);
            xiaoming.add(new File("diary.html", 100));
            xiaoming.add(new File("Composite.java", 200));
            xiaohua.add(new File("memo.tex", 300));
            xiaohong.add(new File("game.doc", 400));
            xiaohong.add(new File("junk.mail", 500));
            rootdir.printList();
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
