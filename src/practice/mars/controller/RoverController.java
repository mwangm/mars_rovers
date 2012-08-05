package practice.mars.controller;

import practice.mars.area.Plateau;
import practice.mars.rover.Heading;
import practice.mars.rover.Location;
import practice.mars.rover.Rover;

public class RoverController {
    private Rover rover;
    private Plateau plateau;

    public RoverController(Rover rover, Plateau plateau) {
        this.rover = rover;
        this.plateau = plateau;
    }

    public void turnLeft() {
        rover.turnLeft();
    }

    public void turnRight() {
        rover.turnRight();
    }

    public void moveForward() {
        if (!willCrossBorader()) {
            rover.moveForward();
        }

    }

    private boolean willCrossBorader() {
        Location roverLocation = rover.getLocation();
        Heading currentHeading = rover.getHeading();

        return currentHeading == Heading.N && (roverLocation.getCoordinateY() == plateau.getBorderY())
                || currentHeading == Heading.S && (roverLocation.getCoordinateY() == 0)
                || currentHeading == Heading.E && (roverLocation.getCoordinateX() == plateau.getBorderX())
                || currentHeading == Heading.W && (roverLocation.getCoordinateX() == 0);

    }

    public String getRoverStatus() {
        return rover.status();
    }
}