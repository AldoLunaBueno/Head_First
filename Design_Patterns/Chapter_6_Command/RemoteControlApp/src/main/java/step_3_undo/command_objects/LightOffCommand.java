package step_3_undo.command_objects;

import step_3_undo.vendor_products.Light;

public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void executes() {
        light.off();
    }
    @Override
    public void undo() {
        light.on();
    }
}
