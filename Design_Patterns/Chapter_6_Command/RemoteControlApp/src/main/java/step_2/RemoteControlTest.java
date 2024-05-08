package step_2;

import step_2.command_objects.*;
import step_2.vendor_products.GarageDoor;
import step_2.vendor_products.Light;
import step_2.vendor_products.Stereo;

public class RemoteControlTest {
    public static void main(String[] args) {
        // Creating and loading remote control
        RemoteControl remote = new RemoteControl();
        remoteLoader(remote);

        // Displaying the actual remote control setting
        System.out.println(remote);

        // Controlling vendor products with remote control
        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        remote.onButtonWasPressed(1);
        remote.offButtonWasPressed(1);
        remote.onButtonWasPressed(2);
        remote.offButtonWasPressed(2);
    }

    private static void remoteLoader(RemoteControl remote) {
        // Creating vendor products (receivers)
        Light livingRoomlight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living room");

        // Creating command objects

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomlight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomlight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        // Setting the commands for remote control
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, stereoOnWithCD, stereoOff);
    }
}
