package clients;

import strategy.FlyNoWay;
import strategy.FlyWithWings;
import strategy.Quack;
import strategy.QuackMute;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Redhead duck.");
    }
}
