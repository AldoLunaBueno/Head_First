package step_2.command_objects;

import step_2.vendor_products.Stereo;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void executes() {
        stereo.off();
    }
}
