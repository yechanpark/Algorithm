package codility.lessons.lesson2_arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddOccurrencesInArrayTest {
    private OddOccurrencesInArray oddOccurrencesInArray;

    @BeforeEach
    public void init() {
        this.oddOccurrencesInArray = new OddOccurrencesInArray();
    }

    @Test
    public void sampleTest() {
        int[] arr = {9, 3, 9, 3, 9, 7, 9};
        int actual = oddOccurrencesInArray.solution(arr);
        int expected = 7;
        assertEquals(expected, actual);
    }
}
