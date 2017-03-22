package patternPackage.strategy.model.entity;

import patternPackage.strategy.model.logic.FlyBehavior;
import patternPackage.strategy.model.logic.QuackBehavior;

public class LowLevelDuck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;


    public LowLevelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }


    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void makeSomeNoise (){

        quackBehavior.Quack();
    }

    public void showMeYourSpeed(){

        flyBehavior.fly();
    }

}
