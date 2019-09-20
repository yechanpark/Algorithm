package test.lessons.lesson4_countingelements;

import codility.lessons.lesson4_countingelements.FrogRiverOne;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrogRiverOneTest {
    private FrogRiverOne frogRiverOne;

    @BeforeClass
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
