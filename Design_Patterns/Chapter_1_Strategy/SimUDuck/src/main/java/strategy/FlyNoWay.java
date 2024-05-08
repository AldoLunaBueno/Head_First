package strategy;

public class FlyNoWay implements IFlyBehavior {
    public void fly() {
        System.out.println("I can't fly.");
    }
}
