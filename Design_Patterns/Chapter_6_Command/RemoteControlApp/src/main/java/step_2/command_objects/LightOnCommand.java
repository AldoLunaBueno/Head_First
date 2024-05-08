package step_2.command_objects;

import step_2.vendor_products.Light;

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
