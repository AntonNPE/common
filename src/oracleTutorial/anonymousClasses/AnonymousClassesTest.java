package oracleTutorial.anonymousClasses;

public class AnonymousClassesTest {


    SimpleInterface simpleInterface = new SimpleInterface() {
        @Override
        public void printSmth() {
            //anonymous class implemented interface;
        }
    };


}

interface SimpleInterface {

    public void printSmth();

}
