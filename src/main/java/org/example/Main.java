package org.example;

public class Main {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        duck.performQuack();
        duck.perfromFly();
        duck.swim();

        ModelDuck mduck = new ModelDuck();
        mduck.perfromFly();
        mduck.setFlyBehavior(new FlyRocketPowered());
        mduck.perfromFly();

    }

}
