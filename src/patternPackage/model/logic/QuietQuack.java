package patternPackage.model.logic;

public class QuietQuack implements QuackBehavior {

    @Override
    public void Quack() {
        System.out.println("I am quiet duck");
    }
}
