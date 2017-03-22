package patternPackage.strategy.model.logic;

public class LoudQuack implements QuackBehavior {

    @Override
    public void Quack() {
        System.out.println("I am very loud duck");
    }
}
