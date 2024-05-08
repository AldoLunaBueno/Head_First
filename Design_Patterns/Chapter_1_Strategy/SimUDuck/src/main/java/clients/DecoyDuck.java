package clients;

import strategy.FlyNoWay;
import strategy.QuackMute;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new QuackMute();
    }
    @Override
    public void display() {
        System.out.println("I'm a decoy duck.");
    }
}
