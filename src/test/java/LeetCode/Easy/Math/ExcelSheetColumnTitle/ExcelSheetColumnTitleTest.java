package LeetCode.Easy.Math.ExcelSheetColumnTitle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcelSheetColumnTitleTest {
    private ExcelSheetColumnTitle excelSheetColumnTitle;

    @BeforeEach
    public void init() {
        this.excelSheetColumnTitle = new ExcelSheetColumnTitle();
    }

    @Test
    public void sample1Test() {
        int n = 1;
        String actual = excelSheetColumnTitle.solution(n);
        String expected = "A";
        assert(expected.equals(actual));
    }

    @Test
    public void sample2Test() {
        int n = 28;
        String actual = excelSheetColumnTitle.solution(n);
        String expected = "AB";
        assert(expected.equals(actual));
    }

    @Test
    public void sample3Test() {
        int n = 701;
        String actual = excelSheetColumnTitle.solution(n);
        String expected = "ZY";
        assert(expected.equals(actual));
    }

    @Test
    public void sample4Test() {
        int n = 26;
        String actual = excelSheetColumnTitle.solution(n);
        String expected = "Z";
        assert(expected.equals(actual));
    }

    @Test
    public void sample5Test() {
        int n = 27;
        String actual = excelSheetColumnTitle.solution(n);
        String expected = "AA";
        assert(expected.equals(actual));
    }

}
