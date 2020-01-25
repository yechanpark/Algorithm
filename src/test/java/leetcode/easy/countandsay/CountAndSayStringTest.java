package leetcode.easy.countandsay;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountAndSayStringTest {
    private CountAndSayString countAndSayString;

    @BeforeEach
    public void init() {
        this.countAndSayString = new CountAndSayString();
    }

    @Test
    public void sample1Test() {
        int n  = 1;
        String actual = countAndSayString.solution(n);
        String expected = "1";
        assert(expected.equals(actual));
    }

    @Test
    public void sample2Test() {
        int n  = 2;
        String actual = countAndSayString.solution(n);
        String expected = "11";
        assert(expected.equals(actual));
    }
    @Test
    public void sample3Test() {
        int n  = 3;
        String actual = countAndSayString.solution(n);
        String expected = "21";
        assert(expected.equals(actual));
    }
    @Test
    public void sample4Test() {
        int n  = 4;
        String actual = countAndSayString.solution(n);
        String expected = "1211";
        assert(expected.equals(actual));
    }

    @Test
    public void sample5Test() {
        int n  = 5;
        String actual = countAndSayString.solution(n);
        String expected = "111221";
        assert(expected.equals(actual));
    }

    @Test
    public void sample6Test() {
        int n  = 6;
        String actual = countAndSayString.solution(n);
        String expected = "312211";
        assert(expected.equals(actual));
    }

    @Test
    public void sample7Test() {
        int n  = 7;
        String actual = countAndSayString.solution(n);
        String expected = "13112221";
        assert(expected.equals(actual));
    }

    @Test
    public void sample8Test() {
        int n  = 8;
        String actual = countAndSayString.solution(n);
        String expected = "1113213211";
        assert(expected.equals(actual));
    }

    @Test
    public void sample9Test() {
        int n  = 9;
        String actual = countAndSayString.solution(n);
        String expected = "31131211131221";
        assert(expected.equals(actual));
    }

    @Test
    public void sample10Test() {
        int n  = 10;
        String actual = countAndSayString.solution(n);
        String expected = "13211311123113112211";
        assert(expected.equals(actual));
    }

    @Test
    public void sample11Test() {
        int n  = 11;
        String actual = countAndSayString.solution(n);
        String expected = "11131221133112132113212221";
        assert(expected.equals(actual));
    }

    @Test
    public void sample12Test() {
        int n  = 12;
        String actual = countAndSayString.solution(n);
        String expected = "3113112221232112111312211312113211";
        assert(expected.equals(actual));
    }

    @Test
    public void sample13Test() {
        int n  = 13;
        String actual = countAndSayString.solution(n);
        String expected = "1321132132111213122112311311222113111221131221";
        assert(expected.equals(actual));
    }

    @Test
    public void sample14Test() {
        int n  = 14;
        String actual = countAndSayString.solution(n);
        String expected = "11131221131211131231121113112221121321132132211331222113112211";
        assert(expected.equals(actual));
    }

    @Test
    public void sample15Test() {
        int n  = 15;
        String actual = countAndSayString.solution(n);
        String expected = "311311222113111231131112132112311321322112111312211312111322212311322113212221";
        assert(expected.equals(actual));
    }

}
