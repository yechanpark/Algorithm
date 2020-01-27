package LeetCode.Easy.Tree.BinaryTreeLevelOrderTraversalII;

import LeetCode.Easy.Tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeLevelOrderTraversalIITest {
    private BinaryTreeLevelOrderTraversalII binaryTreeLevelOrderTraversalII;

    @BeforeEach
    public void init() {
        this.binaryTreeLevelOrderTraversalII = new BinaryTreeLevelOrderTraversalII();
    }

    @Test
    public void sample1Test() {
        TreeNode root = new TreeNode(3);
        TreeNode root1l = new TreeNode(9);
        TreeNode root1r = new TreeNode(20);
        TreeNode root1rl = new TreeNode(15);
        TreeNode root1rr = new TreeNode(7);
        root.left = root1l;
        root.right = root1r;
        root1r.left = root1rl;
        root1r.right = root1rr;

        List<List<Integer>> actual = binaryTreeLevelOrderTraversalII.solution(root);
        List<List<Integer>> expected = new ArrayList<>();

        List<Integer> expected1 = new ArrayList<>();
        expected1.add(15);
        expected1.add(7);
        expected.add(expected1);

        List<Integer> expected2 = new ArrayList<>();
        expected2.add(9);
        expected2.add(20);
        expected.add(expected2);

        List<Integer> expected3 = new ArrayList<>();
        expected3.add(3);
        expected.add(expected3);

        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        TreeNode root = null;

        List<List<Integer>> actual = binaryTreeLevelOrderTraversalII.solution(root);
        List<List<Integer>> expected = new ArrayList<>();

        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        TreeNode root = new TreeNode(1);

        List<List<Integer>> actual = binaryTreeLevelOrderTraversalII.solution(root);
        List<List<Integer>> expected = new ArrayList<>();

        List<Integer> expected1 = new ArrayList<>();
        expected1.add(1);
        expected.add(expected1);

        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        TreeNode root = new TreeNode(1);
        TreeNode root1l = new TreeNode(2);
        root.left = root1l;

        List<List<Integer>> actual = binaryTreeLevelOrderTraversalII.solution(root);
        List<List<Integer>> expected = new ArrayList<>();

        List<Integer> expected1 = new ArrayList<>();
        expected1.add(2);
        expected.add(expected1);

        List<Integer> expected2 = new ArrayList<>();
        expected2.add(1);
        expected.add(expected2);

        assertEquals(expected, actual);
    }

}
