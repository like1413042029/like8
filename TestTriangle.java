package ZY8;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestTriangle {
	@Test
    public void testIsTriangle1(){
        Triangle t = new Triangle(1,1,1);
        assertFalse(t.isTriangle(t));
    }

    @Test
    public void testIsTriangle2(){
        // according to the mutant, this test case should fail
        Triangle t = new Triangle(2,2,1);
        assertFalse(t.isTriangle(t));
    }

    @Test
    public void testIsTriangle3(){
        Triangle t = new Triangle(3,4,5);
        assertFalse(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle4(){
        Triangle t = new Triangle(1,2,3);
        assertFalse(t.isTriangle(t));
    }
}
