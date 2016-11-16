package quizfull.baseTest.intIncrement.constructorExp;

public class constructorExp {

    public static void main(String[] args) {

        A a = new B();


    }


}

class A {

    int i;
    public void printInfo(){
        System.out.println("printInfo from A class");
        i = 15;
    }

    A(){
        System.out.println("Constructor from A class");
        printInfo();
        System.out.println("var i from A constructor = " + i );
    }

}
class B extends A {


    public void printInfo(){
        System.out.println("printInfo from B class");
        i = 30;
    }

    public B() {
        System.out.println("Constructor from B class");
        printInfo();
        System.out.println("var i from B constructor = " + i);
    }
}