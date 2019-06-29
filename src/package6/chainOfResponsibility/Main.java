package package6.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Support noSupportMan   = new NoSupport("noSupportMan");
        Support lt2Man     = new LimitSupport("lt2Man", 2);
        Support specialFor5Man = new SpecialSupport("specialFor5Man", 5);
        Support lt10Man   = new LimitSupport("lt10Man", 10);
        Support oddMan    = new OddSupport("oddMan");
        Support lt15Man    = new LimitSupport("lt15Man", 15);
        // 一层一层深入设置职责链条。
        noSupportMan.setNext(lt2Man).setNext(specialFor5Man).setNext(lt10Man).setNext(oddMan).setNext(lt15Man);
        // 制造各种问题
        for (int i = 0; i < 17; i++) {
            noSupportMan.support(new Trouble(i));
        }
    }
}
