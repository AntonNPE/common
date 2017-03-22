package books.eckel.chapter7.finalTest;

import java.util.Random;

public class FinalTest  {
    static Random random = new Random(100);
    private int int1 = 10;
    private final  int int2 = 100;
    private final static int int3 = random.nextInt(100);
    private Inner i1 = new Inner(1);
    private final Inner i2 = new Inner(10);
    private final static Inner i3 = new Inner(100);

    public static void main(String[] args) {

        FinalTest f1 = new FinalTest();
        f1.i1.count++;
        System.out.println(f1.i1.count);
    }

}

class Inner {

    int count;

    public Inner (){
        count = 0;
    }

    public Inner(int count) {
        this.count = count;
    }
}

