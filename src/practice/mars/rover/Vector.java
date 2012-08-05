package practice.mars.rover;

public class Vector {
    private int componentX;
    private int componentY;

    public Vector(int x, int y) {
        this.componentX = x;
        this.componentY = y;
    }

    public int getComponentX() {
        return componentX;
    }

    public int getComponentY() {
        return componentY;
    }
}
