package codility.lessons.lesson8_leader;

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
        int actual = dominator.solution(arr);

        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(7);

        assertTrue(expected.contains(actual));
    }

    @Test
    public void sample2Test() {
        int[] arr = {2147483647};
        int actaul = dominator.solution(arr);

        List<Integer> expected = new ArrayList<>();
        expected.add(0);

        assertTrue(expected.contains(actaul));
    }


}
