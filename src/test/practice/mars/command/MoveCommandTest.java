package test.practice.mars.command;

import org.junit.Test;
import practice.mars.command.MoveCommand;
import practice.mars.controller.RoverController;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MoveCommandTest {

    @Test
    public void should_invoke_rover_move_forward_method(){
        RoverController rover = mock(RoverController.class);
        MoveCommand command = new MoveCommand(rover);
        command.execute();
        verify(rover).moveForward();
    }

}
