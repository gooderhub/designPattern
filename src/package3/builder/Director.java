package package3.builder;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("文章标题");
        builder.makeString("第1句话");
        builder.makeItems(new String[]{"条目1", "条目2"});
        builder.makeString("第2句话");
        builder.makeItems(new String[]{"条目3", "条目4"});
        builder.close();
    }
}
