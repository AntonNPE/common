package books.eckel.chapter7.stringInitializationTest;

public class StringInitTest {

    private String line1 = "default";
    private String line2 = "default2";

    public StringInitTest(String line1, String line2) {
        this.line1 = line1;
        this.line2 = line2;
    }

    {
        System.out.println(line1);
        System.out.println(line2);
    }

    public static void main(String[] args) {
        StringInitTest st = new StringInitTest("Object","Object");
        System.out.println(st.line1);
        System.out.println(st.line2);
    }
}
