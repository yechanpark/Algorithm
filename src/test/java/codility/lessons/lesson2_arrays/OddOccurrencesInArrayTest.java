package codility.lessons.lesson2_arrays;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OddOccurrencesInArrayTest {
    private OddOccurrencesInArray oddOccurrencesInArray;

    @BeforeClass
    public void init() {
        this.oddOccurrencesInArray = new OddOccurrencesInArray();
    }

    @Test
    public void sampleTest() {
        int[] arr = {9, 3, 9, 3, 9, 7, 9};
        int actual = oddOccurrencesInArray.solution(arr);
        int expected = 7;
        assertEquals(actual, expected);
    }
}
