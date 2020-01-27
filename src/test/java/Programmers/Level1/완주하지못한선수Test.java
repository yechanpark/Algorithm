package Programmers.Level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 완주하지못한선수Test {
    private 완주하지못한선수 solution;

    @BeforeEach
    public void init() {
        this.solution = new 완주하지못한선수();
    }

    @Test
    public void sample1Test() {
        String[] participant = { "leo", "kiki", "eden" };
        String[] completion  = { "eden", "kiki" };
        String actual = solution.solution(participant, completion);
        String expected = "leo";
        assert(expected.equals(actual));
    }

    @Test
    public void sample2Test() {
        String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
        String[] completion  = { "josipa", "filipa", "marina", "nikola" };
        String actual = solution.solution(participant, completion);
        String expected = "vinko";
        assert(expected.equals(actual));
    }

    @Test
    public void sample3Test() {
        String[] participant = { "mislav", "stanko", "mislav", "ana" };
        String[] completion  = { "stanko", "ana", "mislav" };
        String actual = solution.solution(participant, completion);
        String expected = "mislav";
        assert(expected.equals(actual));
    }
}
