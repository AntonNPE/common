package eckelThinkingInJava.chapter7.inheritanceTest;

public class InheritanceTest  {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        System.out.println(a.stringPrint(" - a cast"));
        System.out.println(b.stringPrint(" - b cast"));

    }
}

 class A {

    private String s = "super String";
     public String stringPrint (String a ){
              s += a;
         return s;
     }
}

class B extends A {

}
