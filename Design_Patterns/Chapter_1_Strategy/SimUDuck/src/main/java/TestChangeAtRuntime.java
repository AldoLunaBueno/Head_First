import clients.Duck;
import clients.ModelDuck;
import strategy.FlyRocketPowered;

public class TestChangeAtRuntime {
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        Service.duckPresentation(modelDuck);
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        Service.duckPresentation(modelDuck);
    }
}
