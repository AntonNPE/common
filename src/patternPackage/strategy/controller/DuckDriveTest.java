package patternPackage.strategy.controller;

import patternPackage.strategy.model.entity.LowLevelDuck;

public class DuckDriveTest {

    public static void main(String[] args) {


        LowLevelDuck lowLevelDuck = new LowLevelDuck((() -> System.out.println("QuickFly")) ,(() -> System.out.println("Quiet Quack")) );
        lowLevelDuck.makeSomeNoise();
        lowLevelDuck.showMeYourSpeed();
        lowLevelDuck.setFlyBehavior((()-> System.out.println("Slow Fly")));
        lowLevelDuck.makeSomeNoise();
        lowLevelDuck.showMeYourSpeed();
    }
}
