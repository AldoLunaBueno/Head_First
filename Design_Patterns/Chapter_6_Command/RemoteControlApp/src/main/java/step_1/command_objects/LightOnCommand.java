package step_1.command_objects;

import step_1.vendor_products.Light;

public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void executes() {
        light.on();
    }
}
