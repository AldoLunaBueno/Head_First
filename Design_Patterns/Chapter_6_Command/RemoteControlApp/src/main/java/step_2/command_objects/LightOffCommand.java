package step_2.command_objects;

import step_2.vendor_products.Light;

public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void executes() {
        light.off();
    }
}
