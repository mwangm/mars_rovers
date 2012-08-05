package test.practice.mars.command;

import org.junit.Test;
import practice.mars.command.RightCommand;
import practice.mars.controller.RoverController;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RightCommandTest{
    @Test
    public void should_invoke_rover_turn_right_method(){
        RoverController rover = mock(RoverController.class);
        RightCommand rightCommand = new RightCommand(rover);
        rightCommand.execute();
        verify(rover).turnRight();
    }
}
