package test.practice.mars.main;

import org.junit.Before;
import org.junit.Test;
import practice.mars.controller.RoverController;
import practice.mars.main.MarsRovers;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class MarsRoversTest {

    private MarsRovers marsRovers;
    public static final String COMMAND_STRING = "LRM";
    private RoverController roverController;
    private List<String> inputInfoList;

    @Before
    public void setUp(){
        marsRovers = new MarsRovers();
        inputInfoList = new ArrayList<String>();
    }

    @Test
    public void should_return_get_rover_info_after_execute_command() {
        inputInfoList.add("5 5");
        inputInfoList.add("1 2 N");
        inputInfoList.add("LMLMLMLMM");
        marsRovers.handleMessage(inputInfoList);
        marsRovers.execute();
        assertEquals(marsRovers.getRoversInfo().size(), 1);
        assertEquals(marsRovers.getRoversInfo().get(0),"1 3 N");
    }

    @Test
    public void should_escape_redundant_space_when_get_Info() {
        inputInfoList.add(" 5   5 ");
        inputInfoList.add(" 1   2    N");
        inputInfoList.add("L ML M LML  MM");
        marsRovers.handleMessage(inputInfoList);
        marsRovers.execute();
        assertEquals(marsRovers.getRoversInfo().size(), 1);
        assertEquals(marsRovers.getRoversInfo().get(0),"1 3 N");
    }
}
