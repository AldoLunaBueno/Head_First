package step_3_lambdas.command_objects;

public class NoCommand implements Command {
    @Override
    public void executes() {
        System.out.println("Command not defined this slot.");
    }
}
