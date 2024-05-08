import beverages.Beverage;
import beverages.DarkRoast;
import beverages.Espresso;
import beverages.HouseBlend;
import condiments.Mocha;
import condiments.Soy;
import condiments.Whip;

public class TestMenu {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        displayBeverage(beverage);

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        displayBeverage(beverage1);

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        displayBeverage(beverage2);
    }
    public static void displayBeverage(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
