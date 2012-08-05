package test.practice.mars.rover;

import junit.framework.Assert;
import org.junit.Test;
import practice.mars.rover.Heading;
import practice.mars.rover.Vector;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class HeadingTest {
    @Test
    public void should_get_right_for_facing_direction() {
        Assert.assertEquals(Heading.N.getRight(), Heading.E);
        assertEquals(Heading.E.getRight(), Heading.S);
        assertEquals(Heading.S.getRight(), Heading.W);
        assertEquals(Heading.W.getRight(), Heading.N);
    }

    @Test
    public void should_get_left_for_facing_direction() {
        assertEquals(Heading.N.getLeft(), Heading.W);
        assertEquals(Heading.W.getLeft(), Heading.S);
        assertEquals(Heading.S.getLeft(), Heading.E);
        assertEquals(Heading.E.getLeft(), Heading.N);
    }

    @Test
    public void should_get_vector_for_move_forward() {
        assertTrue(isEqual(Heading.N.moveForward(), new Vector(0, 1)));
        assertTrue(isEqual(Heading.W.moveForward(), new Vector(-1, 0)));
        assertTrue(isEqual(Heading.S.moveForward(), new Vector(0, -1)));
        assertTrue(isEqual(Heading.E.moveForward(), new Vector(1, 0)));
    }

    private boolean isEqual(Vector vector1, Vector vector2) {
        return ((vector1.getComponentX() == vector2.getComponentX()) && (vector1.getComponentY() == vector1.getComponentY())) ? true : false;
    }
}
