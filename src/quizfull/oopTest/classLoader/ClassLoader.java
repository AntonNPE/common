package quizfull.oopTest.classLoader;

public class ClassLoader {

    public static void main(String[] args) {
        System.out.println(B.x);
    }

}


class A {

    A(){
        System.out.println("Constructor A");
    }
    public static int x = 1;
    static {
        System.out.println("Class A");
    }
}
class B extends A {

    static {
        System.out.println("CLass B");
    }

    B(){
        System.out.println("Constructor B");
    }

}