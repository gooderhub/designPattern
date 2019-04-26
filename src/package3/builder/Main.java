package package3.builder;

public class Main {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director1 = new Director(textBuilder);
        director1.construct();
        System.out.println(textBuilder.getResult());

        MarkdownBuilder markdownBuilder = new MarkdownBuilder();
        Director director2 = new Director(markdownBuilder);
        director2.construct();
        System.out.println(markdownBuilder.getResult());
    }
}
