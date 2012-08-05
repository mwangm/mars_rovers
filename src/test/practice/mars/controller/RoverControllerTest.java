package test.practice.mars.controller;

import org.junit.Before;
import org.junit.Test;
import practice.mars.area.Plateau;
import practice.mars.controller.RoverController;
import practice.mars.rover.Heading;
import practice.mars.rover.Location;
import practice.mars.rover.Rover;

import static org.mockito.Mockito.*;

public class RoverControllerTest {

    private RoverController roverController;
    private Plateau plateau;
    private Rover rover;

    @Before
    public void setUp() throws Exception {
        rover = mock(Rover.class);
        plateau = mock(Plateau.class);
        roverController = new RoverController(rover, plateau);
    }

    @Test
    public void should_call_rover_turn_left_method_when_turn_lift() {
        roverController.turnLeft();
        verify(rover).turnLeft();
    }

    @Test
    public void should_call_rover_turn_right_method_when_turn_right() {
        roverController.turnRight();
        verify(rover).turnRight();
    }

    @Test
    public void should_call_rover_move_forward_method_when_move_forward_will_not_cross_board() {
        roverController.moveForward();
        verify(rover).moveForward();
    }

    @Test
    public void should_not_call_rover_move_forward_method_when_keep_heading_to_North_will_cross_board() {
        setPlateau(5, 5);
        setRoverState(2, 5, Heading.N);
        roverController.moveForward();
        verify(rover, never()).moveForward();
    }

    @Test
    public void should_not_call_rover_move_forward_method_when_keep_heading_to_South_will_cross_board() {
        setPlateau(5, 5);
        setRoverState(2, 0, Heading.S);
        roverController.moveForward();
        verify(rover, never()).moveForward();
    }

    @Test
    public void should_not_call_rover_move_forward_method_when_keep_heading_to_East_will_cross_board() {
        setPlateau(5, 5);
        setRoverState(5, 2, Heading.E);
        roverController.moveForward();
        verify(rover, never()).moveForward();
    }

    @Test
    public void should_not_call_rover_move_forward_method_when_keep_heading_to_West_will_cross_board(){
        setPlateau(5,5);
        setRoverState(0, 5, Heading.W);
        roverController.moveForward();
        verify(rover, never()).moveForward();
    }


    private void setPlateau(int boarderX, int boarderY) {
        when(plateau.getBorderX()).thenReturn(boarderX);
        when(plateau.getBorderY()).thenReturn(boarderY);
    }

    private void setRoverState(int x, int y, Heading heading) {
        Location location = mockRoverLocationInPlateau(x, y);
        when(rover.getLocation()).thenReturn(location);
        when(rover.getHeading()).thenReturn(heading);
    }


    private Location mockRoverLocationInPlateau(int x, int y) {
        Location location = mock(Location.class);
        when(location.getCoordinateX()).thenReturn(x);
        when(location.getCoordinateY()).thenReturn(y);
        return location;
    }
}
