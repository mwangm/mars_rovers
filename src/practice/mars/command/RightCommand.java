package practice.mars.command;

import practice.mars.controller.RoverController;

public class RightCommand extends Command{
    public RightCommand(RoverController rover) {
        super(rover);
    }

    @Override
    public void execute() {
       rover.turnRight();
    }
}
