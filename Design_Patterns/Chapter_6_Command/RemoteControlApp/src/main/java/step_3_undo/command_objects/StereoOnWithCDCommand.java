package step_3_undo.command_objects;

import step_3_undo.vendor_products.Stereo;

public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void executes() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
