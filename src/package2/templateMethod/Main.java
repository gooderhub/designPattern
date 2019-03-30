package package2.templateMethod;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay adc = new CharDisplay('C');
        AbstractDisplay ads = new StringDisplay("HelloWorld");

        adc.display();
        ads.display();
    }
}
