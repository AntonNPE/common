package roadToEpam.staticNestedClasses.superInterfaceTest;

public interface SimpleInterface {

    void print();
    class Implementator implements SimpleInterface {

        public  void print(){
            System.out.println("asdadasd");
        }
    }


}
class AnotherClass  {
    public static void main(String[] args) {
        SimpleInterface.Implementator imp = new SimpleInterface.Implementator();
        imp.print();
    }

}
