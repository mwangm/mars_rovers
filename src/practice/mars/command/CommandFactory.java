package practice.mars.command;

import practice.mars.controller.RoverController;

public abstract class CommandFactory {

    public static Command createCommand(char commandChar, RoverController rover) {
        switch (commandChar) {
            case 'L':
                return new LeftCommand(rover);
            case 'R':
                return new RightCommand(rover);
            case 'M':
                return new MoveCommand(rover);
            default:
                return null;
        }
    }
}
