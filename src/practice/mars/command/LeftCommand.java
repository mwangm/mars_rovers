package practice.mars.command;

import practice.mars.controller.RoverController;

public class LeftCommand extends Command {

    public LeftCommand(RoverController rover) {
        super(rover);
    }

    @Override
    public void execute() {
        rover.turnLeft();
    }
}
