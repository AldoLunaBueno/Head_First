package beverages;

public class Decaf extends Beverage {
    public Decaf() {
        description = "beverages.Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}