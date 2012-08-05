package practice.mars.main;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String filePath = "marsRovers.txt";
        List<String> roverInfoList = InputParser.readFile(filePath);

        MarsRovers marsRovers = new MarsRovers();
        marsRovers.handleMessage(roverInfoList);
        marsRovers.execute();

        System.out.println("------------output--------------");
        for (String roverInfo : marsRovers.getRoversInfo()) {
            System.out.println(roverInfo);
        }

    }
}
