package package3.builder;

public class MarkdownBuilder extends Builder {
    private StringBuffer sb = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        sb.append("========================\n");
        sb.append("# " + title + "\n");
        sb.append("\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("> "+str+"\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            sb.append("- "+items[i]+"\n");
        }
    }

    @Override
    public void close() {
        sb.append("========================\n");
    }

    public String getResult() {
        return sb.toString();
    }
}
