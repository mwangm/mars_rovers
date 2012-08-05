package practice.mars.rover;

public class Rover {
    private Heading currentHeading;
    private Location location;

    public Rover(int coordinateX, int coordinateY, Heading heading) {
        location = new Location(coordinateX, coordinateY);
        currentHeading = heading;
    }

    public Location getLocation() {
        return location;
    }

    public Heading getHeading() {
        return currentHeading;
    }

    public void turnLeft() {
        currentHeading = currentHeading.getLeft();
    }

    public void turnRight() {
       currentHeading = currentHeading.getRight();
    }

    public void moveForward() {
        Vector moveVector = currentHeading.moveForward();
        location.move(moveVector);
    }

    public String status() {
        return location.getCoordinateX() + " " + location.getCoordinateY() + " " + currentHeading.toString();
    }

}
