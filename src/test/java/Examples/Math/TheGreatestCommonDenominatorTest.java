package Examples.Math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheGreatestCommonDenominatorTest {
    private TheGreatestCommonDenominator theGreatestCommonDenominator;

    @BeforeEach
    public void init() {
        this.theGreatestCommonDenominator = new TheGreatestCommonDenominator();
    }

    @Test
    public void gcd1Test() {
        int a = 72;
        int b = 48;
        int actual = theGreatestCommonDenominator.gcd(a, b);
        int expected = 24;
        assertEquals(expected, actual);
    }

    @Test
    public void gcd2Test() {
        int a = 18;
        int b = 24;
        int actual = theGreatestCommonDenominator.gcd(a, b);
        int expected = 6;
        assertEquals(expected, actual);
    }

}

