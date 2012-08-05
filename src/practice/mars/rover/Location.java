package practice.mars.rover;

public class Location {
    private int coordinateX;
    private int coordinateY;

    public Location(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {

        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void move(Vector vector) {
        this.coordinateX += vector.getComponentX();
        this.coordinateY += vector.getComponentY();
    }
}
