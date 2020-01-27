package LeetCode.Easy.Tree.BalancedBinaryTree;

import LeetCode.Easy.Tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalancedBinaryTreeTest {
    private BalancedBinaryTree balancedBinaryTree;

    @BeforeEach
    public void init() {
        this.balancedBinaryTree = new BalancedBinaryTree();
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

        boolean actual = balancedBinaryTree.solution(root);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        TreeNode root = new TreeNode(1);
        TreeNode root1l = new TreeNode(2);
        TreeNode root1r = new TreeNode(2);
        TreeNode root1ll = new TreeNode(3);
        TreeNode root1lr = new TreeNode(3);
        TreeNode root1lll = new TreeNode(4);
        TreeNode root1llr = new TreeNode(4);
        root.left = root1l;
        root.right = root1r;
        root1l.left = root1ll;
        root1l.right = root1lr;
        root1ll.left = root1lll;
        root1ll.right = root1llr;

        boolean actual = balancedBinaryTree.solution(root);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        boolean actual = balancedBinaryTree.solution(null);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        TreeNode root = new TreeNode(1);
        TreeNode root1l = new TreeNode(2);
        TreeNode root1r = new TreeNode(2);
        TreeNode root1ll = new TreeNode(3);
        TreeNode root1lr = new TreeNode(3);
        TreeNode root1lll = new TreeNode(4);
        TreeNode root1llr = new TreeNode(4);
        root.left = root1l;
        root.right = root1r;
        root1l.left = root1ll;
        root1l.right = root1lr;
        root1ll.left = root1lll;
        root1ll.right = root1llr;

        boolean actual = balancedBinaryTree.solution(null);
        boolean expected = true;

        assertEquals(expected, actual);
    }

}
