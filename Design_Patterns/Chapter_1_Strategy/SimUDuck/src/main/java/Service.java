import clients.Duck;

public class Service {
    public static void duckPresentation(Duck d) {
        System.out.println("----------------");
        d.display();
        d.performFly();
        d.performQuack();
    }
}
