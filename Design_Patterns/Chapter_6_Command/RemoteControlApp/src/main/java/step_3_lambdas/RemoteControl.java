package step_3_lambdas;

import step_3_lambdas.command_objects.Command;
import step_3_lambdas.command_objects.NoCommand;

public class RemoteControl {
    private static final int numbSlots = 7;
    private Command[] onCommands;
    private Command[] offCommands;
    public RemoteControl() {
        onCommands = new Command[numbSlots];
        offCommands = new Command[numbSlots];

        Command noCommand = new NoCommand();
        for (int i = 0; i < numbSlots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPressed(int slot) {
        onCommands[slot].executes();
    }
    public void offButtonWasPressed(int slot) {
        offCommands[slot].executes();
    }
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < numbSlots; i++) {
            stringBuff.append("[slot " + i + "] "
                    + onCommands[i].getClass().getSimpleName() + " "
                    + offCommands[i].getClass().getSimpleName() + "\n");
        }
        return stringBuff.toString();
    }
}
