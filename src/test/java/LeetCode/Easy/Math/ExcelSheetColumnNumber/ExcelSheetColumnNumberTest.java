package LeetCode.Easy.Math.ExcelSheetColumnNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelSheetColumnNumberTest {
    private ExcelSheetColumnNumber excelSheetColumnNumber;

    @BeforeEach
    public void init() {
        this.excelSheetColumnNumber = new ExcelSheetColumnNumber();
    }

    @Test
    public void sample1Test() {
        String s = "A";
        int actual = excelSheetColumnNumber.solution(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        String s = "AA";
        int actual = excelSheetColumnNumber.solution(s);
        int expected = 27;
        assertEquals(expected, actual);
    }

}
