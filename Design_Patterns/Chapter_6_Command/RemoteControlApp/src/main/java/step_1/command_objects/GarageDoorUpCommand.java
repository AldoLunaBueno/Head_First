package step_1.command_objects;

import step_1.vendor_products.GarageDoor;

public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void executes() {
        garageDoor.up();
    }
}
