package test.practice.mars.invoker;

import org.junit.Test;
import practice.mars.controller.RoverController;
import practice.mars.invoker.RoverInvoker;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RoverInvokerTest {
    @Test
    public void should_parse_command_for_rover_controller(){
        RoverController roverController = mock(RoverController.class);
        RoverInvoker roverInvoker = new RoverInvoker(roverController,"LMR");
        roverInvoker.commandRover();
        verify(roverController).turnLeft();
        verify(roverController).turnRight();
        verify(roverController).moveForward();
    }
}
