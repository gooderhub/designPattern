package package1.adapter.useclass;

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }
    @Override
    public void printWeak() {
        showWithParen();
    }
    @Override
    public void printStrong() {
        showWithAster();
    }
}
