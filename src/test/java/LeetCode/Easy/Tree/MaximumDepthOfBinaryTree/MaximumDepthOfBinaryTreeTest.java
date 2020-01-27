package LeetCode.Easy.Tree.MaximumDepthOfBinaryTree;

import LeetCode.Easy.Tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepthOfBinaryTreeTest {
    private MaximumDepthOfBinaryTree maximumDepthOfBinaryTree;

    @BeforeEach
    public void init() {
        this.maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
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

        int actual = maximumDepthOfBinaryTree.solution(root);
        int expected = 3;
        assertEquals(expected, actual);
    }

}
