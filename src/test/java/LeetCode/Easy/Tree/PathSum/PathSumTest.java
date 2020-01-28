package LeetCode.Easy.Tree.PathSum;

import LeetCode.Easy.Tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathSumTest {
    private PathSum pathSum;

    @BeforeEach
    public void init() {
        this.pathSum = new PathSum();
    }

    @Test
    public void sample1Test() {
        TreeNode root = new TreeNode(5);
        TreeNode root1l = new TreeNode(4);
        TreeNode root1r = new TreeNode(8);
        TreeNode root1ll = new TreeNode(11);
        TreeNode root1rl = new TreeNode(13);
        TreeNode root1rr = new TreeNode(4);
        TreeNode root1lll = new TreeNode(7);
        TreeNode root1llr = new TreeNode(2);
        TreeNode root1rrr = new TreeNode(1);
        root.left = root1l;
        root.right = root1r;

        root1l.left = root1ll;
        root1r.left = root1rl;
        root1r.right = root1rr;

        root1ll.left = root1lll;
        root1ll.right = root1llr;
        root1rr.right = root1rrr;


        boolean actual = pathSum.solution(root, 22);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        boolean actual = pathSum.solution(null, 0);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        TreeNode root = new TreeNode(1);
        boolean actual = pathSum.solution(root, 1);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        TreeNode root = new TreeNode(1);
        TreeNode root1l = new TreeNode(2);
        root.left = root1l;
        boolean actual = pathSum.solution(root, 1);
        boolean expected = false;
        assertEquals(expected, actual);
    }

}
