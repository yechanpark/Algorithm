package test.lessons.lesson8_leader;

import codility.lessons.lesson8_leader.Dominator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class DominatorTest {
    private Dominator dominator;

    @BeforeClass
    public void init() {
        this.dominator = new Dominator();
    }

    @Test
    public void sample1Test() {
        int[] arr = {3, 4, 3, 2, 3, -1, 3, 3};
        int got = dominator.solution(arr);

        List<Integer> answer = new ArrayList<>();
        answer.add(0);
        answer.add(2);
        answer.add(4);
        answer.add(6);
        answer.add(7);

        assertTrue(answer.contains(got));
    }

    @Test
    public void sample2Test() {
        int[] arr = {2147483647};
        int got = dominator.solution(arr);

        List<Integer> answer = new ArrayList<>();
        answer.add(0);

        assertTrue(answer.contains(got));
    }


}
