package LeetCode.Easy.BrainTeaser.NimGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NimGameTest {
    private NimGame nimGame;

    @BeforeEach
    public void init() {
        this.nimGame = new NimGame();
    }

    @Test
    public void sample1Test() {
        int n = 1;
        assertTrue(nimGame.solution(n));
    }

    @Test
    public void sample2Test() {
        int n = 2;
        assertFalse(nimGame.solution(n));
    }

    @Test
    public void sample3Test() {
        int n = 3;
        assertTrue(nimGame.solution(n));
    }

    @Test
    public void sample4Test() {
        int n = 4;
        assertFalse(nimGame.solution(n));
    }

    @Test
    public void sample5Test() {
        int n = 5;
        assertTrue(nimGame.solution(n));
    }

    @Test
    public void sample6Test() {
        int n = 6;
        assertTrue(nimGame.solution(n));
    }

    @Test
    public void sample7Test() {
        int n = 7;
        assertTrue(nimGame.solution(n));
    }

    @Test
    public void sample8Test() {
        int n = 8;
        assertFalse(nimGame.solution(n));
    }

    @Test
    public void sample9Test() {
        int n = 9;
        assertTrue(nimGame.solution(n));
    }

    @Test
    public void sample10Test() {
        int n = 10;
        assertTrue(nimGame.solution(n));
    }

    @Test
    public void sample11Test() {
        int n = 11;
        assertTrue(nimGame.solution(n));
    }

    @Test
    public void sample12Test() {
        int n = 12;
        assertFalse(nimGame.solution(n));
    }

    @Test
    public void sample13Test() {
        int n = 13;
        assertTrue(nimGame.solution(n));
    }

}
