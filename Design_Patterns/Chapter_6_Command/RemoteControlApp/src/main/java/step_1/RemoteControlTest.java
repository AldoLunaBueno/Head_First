package step_1;

import step_1.SimpleRemoteControl;
import step_1.command_objects.GarageDoorUpCommand;
import step_1.command_objects.LightOnCommand;
import step_1.vendor_products.GarageDoor;
import step_1.vendor_products.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageDoorUp =
                new GarageDoorUpCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorUp);
        remote.buttonWasPressed();
    }
}
