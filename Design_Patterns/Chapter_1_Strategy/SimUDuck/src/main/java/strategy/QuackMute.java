package strategy;

public class QuackMute implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quack.");
    }
}
