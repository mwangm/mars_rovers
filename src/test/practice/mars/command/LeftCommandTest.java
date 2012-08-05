package test.practice.mars.command;


import org.junit.Test;
import practice.mars.command.LeftCommand;
import practice.mars.controller.RoverController;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LeftCommandTest {
    @Test
    public void should_call_rover_turn_left_method()
    {
        RoverController rover = mock(RoverController.class);
        LeftCommand leftCommand = new LeftCommand(rover);
        leftCommand.execute();
        verify(rover).turnLeft();
    }


}
