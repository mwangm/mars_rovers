package test.practice.mars.rover;

import org.junit.Test;
import practice.mars.rover.Heading;
import practice.mars.rover.Rover;

import static junit.framework.Assert.assertEquals;

public class RoverTest {

    @Test
    public void should_heading_east_when_turn_right_from_facing_north() {
        Rover rover = new Rover(0, 0, Heading.N);
        rover.turnRight();
        assertEquals(rover.getHeading(), Heading.E);
    }

    @Test
    public void should_heading_west_when_turn_left_from_facing_north() {
        Rover rover = new Rover(0, 0, Heading.N);
        rover.turnLeft();
        assertEquals(rover.getHeading(), Heading.W);
    }

    @Test
    public void should_increase_coordinateY_when_facing_north() {
        final int ORIGINAL_COORDINATE_Y = 2;
        Rover rover = new Rover(0, ORIGINAL_COORDINATE_Y, Heading.N);
        rover.moveForward();
        assertEquals(rover.getLocation().getCoordinateY(), ORIGINAL_COORDINATE_Y + 1);
    }
}
