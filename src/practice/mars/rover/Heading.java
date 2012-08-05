package practice.mars.rover;

public enum Heading {
    N("W", "E", new Vector(0, 1)),
    S("E", "W", new Vector(0, -1)),
    E("N", "S", new Vector(1, 0)),
    W("S", "N", new Vector(-1, 0));

    private String left;
    private String right;
    private Vector moveVector;

    private Heading(String left, String right, Vector moveVector) {
        this.left = left;
        this.right = right;
        this.moveVector = moveVector;
    }

    public Heading getLeft() {
        return Heading.valueOf(this.left);
    }

    public Heading getRight() {
        return Heading.valueOf(this.right);
    }

    public Vector moveForward() {
        return moveVector;
    }
}
