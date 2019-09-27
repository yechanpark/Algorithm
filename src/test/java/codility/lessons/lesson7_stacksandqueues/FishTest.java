package codility.lessons.lesson7_stacksandqueues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FishTest {
    private Fish fish;

    @BeforeEach
    public void init() {
        this.fish = new Fish();
    }

    @Test
    public void sample1Test() {
        int[] a = {4, 3, 2, 1, 5};
        int[] b = {0, 1, 0, 0, 0};
        int actual = fish.solution(a, b);
        int expected = 2;
        assertEquals(actual, expected);
    }

}
