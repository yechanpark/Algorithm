package LeetCode.Easy.Math.HappyNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HappyNumberTest {
    private HappyNumber happyNumber;

    @BeforeEach
    public void init() {
        this.happyNumber = new HappyNumber();
    }

    @Test
    public void sample1Test() {
        int n = 19;
        boolean actual = happyNumber.solution(n);
        boolean expected = true;
        assertEquals(expected, actual);
    }

}