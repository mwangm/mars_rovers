package test.practice.mars.main;

import org.junit.Test;
import practice.mars.main.InputParser;

import static junit.framework.Assert.assertEquals;

public class InputParserTest {

    @Test
    public void should_escape_redundant_space_when_get_Info() {
        assertEquals(InputParser.removeRedundantSpace(" 5  5 "), "5 5");
        assertEquals(InputParser.removeAllSpace("L ML M LML "), "LMLMLML");
    }
}
