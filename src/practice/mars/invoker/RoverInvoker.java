package practice.mars.invoker;

import practice.mars.command.Command;
import practice.mars.command.CommandFactory;
import practice.mars.controller.RoverController;

public class RoverInvoker {
    private RoverController roverController;
    private String commandSequence;

    public RoverInvoker(RoverController rover, String commandSequence) {
        this.roverController = rover;
        this.commandSequence = commandSequence;
    }

    private Command ParseCommand(char command) {
            return  CommandFactory.createCommand(command, this.roverController);
        }

    public void commandRover(){
        for (int i = 0; i < commandSequence.length(); i++) {
            Command command = ParseCommand(commandSequence.charAt(i));
            if(command!=null) command.execute();
        }
    }
    public String getRoverInfo(){
        return roverController.getRoverStatus();
    }
}
