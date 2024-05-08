package clients;

import strategy.IFlyBehavior;
import strategy.IQuackBehavior;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    public abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    public void setFlyBehavior(IFlyBehavior fb) {
        this.flyBehavior = fb;
    }
    public void setQuackBehavior(IQuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
