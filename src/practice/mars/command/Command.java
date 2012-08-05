package practice.mars.command;

import practice.mars.controller.RoverController;

public abstract class Command {
    protected RoverController rover;

    public Command(RoverController rover) {
        this.rover = rover;
    }

    public abstract void execute();
}
