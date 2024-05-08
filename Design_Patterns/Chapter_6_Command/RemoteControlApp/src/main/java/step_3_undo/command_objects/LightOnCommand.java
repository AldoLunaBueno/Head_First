package step_3_undo.command_objects;

import step_3_undo.vendor_products.Light;

public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void executes() {
        light.on();
    }
    @Override
    public void undo() {
        light.off();
    }
}
