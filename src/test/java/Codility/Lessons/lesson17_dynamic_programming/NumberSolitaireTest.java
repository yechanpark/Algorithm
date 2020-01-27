package Codility.Lessons.lesson17_dynamic_programming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSolitaireTest {
    private NumberSolitaire numberSolitaire;

    @BeforeEach
    public void init() {
        this.numberSolitaire = new NumberSolitaire();
    }

    @Test
    public void sample1Test() {
        int[] A = {1, -2, 0, 9, -1, -2};
        int actual = numberSolitaire.solution(A);
        int expected = 8;
        assertEquals(expected, actual);
    }

}
