package step_3_undo;

import step_3_undo.command_objects.LightOffCommand;
import step_3_undo.command_objects.LightOnCommand;
import step_3_undo.command_objects.StereoOffCommand;
import step_3_undo.command_objects.StereoOnWithCDCommand;
import step_3_undo.vendor_products.Light;
import step_3_undo.vendor_products.Stereo;

public class RemoteControlTest {
    public static void main(String[] args) {
        // Creating and loading remote control
        RemoteControlWithUndo remote = new RemoteControlWithUndo();
        remoteLoader(remote);

        // Controlling vendor products with remote control

        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);

        // Displaying the actual remote control setting
        System.out.println(remote);

        remote.undoButtonWasPressed();

        remote.offButtonWasPressed(0);
        remote.onButtonWasPressed(0);

        // Displaying the actual remote control setting
        System.out.println(remote);

        remote.undoButtonWasPressed();
    }

    private static void remoteLoader(RemoteControlWithUndo remote) {
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
