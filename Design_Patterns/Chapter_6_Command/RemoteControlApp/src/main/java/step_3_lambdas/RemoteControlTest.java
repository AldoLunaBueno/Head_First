package step_3_lambdas;

import step_3_lambdas.vendor_products.Light;
import step_3_lambdas.vendor_products.Stereo;

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

        // Creating command objects (---nothing now---)
        // Setting the commands for remote control (no sé cómo funciona)
        remote.setCommand(0,
                () -> livingRoomlight.on(),
                () -> livingRoomlight.off());
        remote.setCommand(1,
                () -> kitchenLight.on(),
                () -> kitchenLight.off());
        remote.setCommand(2,
                () -> {
                    stereo.on();
                    stereo.setCD();
                    stereo.setVolume(11);
                },
                () -> stereo.off());
    }
}
