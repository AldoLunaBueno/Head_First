package clients;

import strategy.FlyNoWay;
import strategy.QuackMute;
import strategy.QuackSqueak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new QuackSqueak();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck.");
    }
}
