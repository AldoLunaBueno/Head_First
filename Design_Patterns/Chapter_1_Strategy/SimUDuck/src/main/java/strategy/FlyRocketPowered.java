package strategy;

public class FlyRocketPowered implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a FUCKING ROCKET!!");
    }
}
