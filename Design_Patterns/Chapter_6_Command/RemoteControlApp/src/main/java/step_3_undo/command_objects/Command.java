package step_3_undo.command_objects;

public interface Command {
    void executes();
    void undo();
}
