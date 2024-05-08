package step_2.command_objects;

public class NoCommand implements Command {
    @Override
    public void executes() {
        System.out.println("Command not defined this slot.");
    }
}
