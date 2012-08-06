package practice.mars.main;

import practice.mars.area.Plateau;
import practice.mars.controller.RoverController;
import practice.mars.invoker.RoverInvoker;
import practice.mars.rover.Heading;
import practice.mars.rover.Rover;

import java.util.ArrayList;
import java.util.List;

public class MarsRovers {
    private Plateau plateau;
    private List<RoverInvoker> roverInvokerList;

    public MarsRovers() {
        roverInvokerList = new ArrayList<RoverInvoker>();
    }

    public void handleMessage(List<String> messageList) {
        initPlateau(messageList.get(0));
        for (int i = 1; i+1 < messageList.size(); i += 2) {
            RoverController roverController = createRoverController(messageList.get(i));
            addRoverInvoker(roverController, messageList.get(i + 1));
        }
    }

    private void initPlateau(String plateauInfo) {
        plateauInfo = InputParser.removeRedundantSpace(plateauInfo);
        String[] border = plateauInfo.split(" ");
        this.plateau = new Plateau(Integer.parseInt(border[0]), Integer.parseInt(border[1]));

    }

    private RoverController createRoverController(String roverInfo) {
        return new RoverController(parseRover(roverInfo), plateau);
    }

    private Rover parseRover(String roverInfoString) {
        roverInfoString = InputParser.removeRedundantSpace(roverInfoString);
        String[] roverInfo = roverInfoString.split(" ");
        return new Rover(Integer.parseInt(roverInfo[0]), Integer.parseInt(roverInfo[1]), Heading.valueOf(roverInfo[2]));
    }

    private void addRoverInvoker(RoverController roverController, String commandLine) {
        commandLine = InputParser.removeAllSpace(commandLine);
        RoverInvoker roverInvoker = new RoverInvoker(roverController, commandLine);
        roverInvokerList.add(roverInvoker);
    }

    public void execute() {
        for (RoverInvoker roverInvoker : roverInvokerList) {
            roverInvoker.commandRover();
        }
    }

    public List<String> getRoversInfo() {
        List<String> roverInfoList = new ArrayList<String>();
        for (RoverInvoker roverInvoker : roverInvokerList) {
            roverInfoList.add(roverInvoker.getRoverInfo());
        }
        return roverInfoList;
    }

}
