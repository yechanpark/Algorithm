package codility.lessons.lesson4_countingelements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrogRiverOneTest {
    private FrogRiverOne frogRiverOne;

    @BeforeEach
    public void init() {
        this.frogRiverOne = new FrogRiverOne();
    }

    @Test
    public void sample1Test() {
        int[] arr = {1, 3, 1, 4, 2, 3, 5, 4};
        int actual = frogRiverOne.solution(5, arr);
        int expected = 6;
        assertEquals(actual, expected);
    }
}
