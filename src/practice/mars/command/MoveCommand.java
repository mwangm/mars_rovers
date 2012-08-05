package practice.mars.command;

import practice.mars.controller.RoverController;

public class MoveCommand extends Command{
    public MoveCommand(RoverController rover) {
        super(rover);
    }

    @Override
    public void execute() {
        rover.moveForward();
    }
}
