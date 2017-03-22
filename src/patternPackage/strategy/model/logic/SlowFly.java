package patternPackage.strategy.model.logic;

public class SlowFly implements  FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I  fly like like your granny");
    }
}
