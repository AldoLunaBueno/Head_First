package strategy;

public class QuackSqueak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
