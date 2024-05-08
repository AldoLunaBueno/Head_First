package step_1;

import step_1.command_objects.Command;

public class SimpleRemoteControl {
    private Command slot;
    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;        
    }
    public void buttonWasPressed() {
        slot.executes();
    }
}
