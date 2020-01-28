package LeetCode.Easy.Tree.MinimumDepthOfBinaryTreeTest;

import LeetCode.Easy.Tree.MinimumDepthOfBinaryTree.MinimumDepthOfBinaryTree;
import LeetCode.Easy.Tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDepthOfBinaryTreeTest {
    private MinimumDepthOfBinaryTree minimumDepthOfBinaryTree;

    @BeforeEach
    public void init() {
        this.minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();
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

        int actual = minimumDepthOfBinaryTree.solution(root);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        TreeNode root = new TreeNode(1);
        TreeNode root1l = new TreeNode(2);
        TreeNode root1r = new TreeNode(3);
        TreeNode root1ll = new TreeNode(4);
        TreeNode root1lr = new TreeNode(5);
        root.left = root1l;
        root.right = root1r;
        root1l.left = root1ll;
        root1l.right = root1lr;

        int actual = minimumDepthOfBinaryTree.solution(root);
        int expected = 2;
        assertEquals(expected, actual);
    }

}
