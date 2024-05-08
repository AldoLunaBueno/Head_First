package step_2.command_objects;

import step_2.vendor_products.Stereo;

public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;
    private int initialVolume;
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
        initialVolume = 11;
    }

    @Override
    public void executes() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(initialVolume);
    }
}
