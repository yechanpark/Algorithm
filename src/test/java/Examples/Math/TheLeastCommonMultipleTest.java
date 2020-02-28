package Examples.Math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheLeastCommonMultipleTest {
    private TheLeastCommonMultiple theLeastCommonMultiple;

    @BeforeEach
    public void init() {
        this.theLeastCommonMultiple = new TheLeastCommonMultiple();
    }

    @Test
    public void lcm1Test() {
        int a = 72;
        int b = 48;
        int actual = theLeastCommonMultiple.lcm(a, b);
        int expected = 144;
        assertEquals(expected, actual);
    }

    @Test
    public void lcm2Test() {
        int a = 18;
        int b = 24;
        int actual = theLeastCommonMultiple.lcm(a, b);
        int expected = 72;
        assertEquals(expected, actual);
    }

}

