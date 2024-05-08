package step_3_undo;

import step_3_undo.command_objects.Command;
import step_3_undo.command_objects.NoCommand;

public class RemoteControlWithUndo {
    private static final int numbSlots = 7;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    public RemoteControlWithUndo() {
        onCommands = new Command[numbSlots];
        offCommands = new Command[numbSlots];

        Command noCommand = new NoCommand();
        for (int i = 0; i < numbSlots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPressed(int slot) {
        onCommands[slot].executes();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPressed(int slot) {
        offCommands[slot].executes();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < numbSlots; i++) {
            stringBuff.append("[slot " + i + "] "
                    + onCommands[i].getClass().getSimpleName() + " "
                    + offCommands[i].getClass().getSimpleName() + "\n");
        }
        stringBuff.append("[undo slot] "
                + undoCommand.getClass().getSimpleName() + "\n");
        return stringBuff.toString();
    }
}
