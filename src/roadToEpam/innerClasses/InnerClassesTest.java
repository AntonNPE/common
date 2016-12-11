package roadToEpam.innerClasses;

public class InnerClassesTest {
    public static void main(String[] args) {

        A instanceA = new A();
        A.B instanceB = instanceA.getBInstance();
        System.out.println(instanceB.getAname());

    }
}

class A {

    private String aName = "Class A default name";

    public String getaName() {
        return aName;
    }

     class B {

        private String aName = "Class B defult name";
        public String getAname(){
            return A.this.aName;    // this.aName вернёт значение переменной aName вложенного класса.
        }
    }

     B getBInstance (){
        return new B();
    }

}
