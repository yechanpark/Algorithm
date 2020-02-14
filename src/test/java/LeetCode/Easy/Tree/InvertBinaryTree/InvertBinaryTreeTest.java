package LeetCode.Easy.Tree.InvertBinaryTree;

import LeetCode.Easy.Tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class InvertBinaryTreeTest {
    private InvertBinaryTree invertBinaryTree;

    @BeforeEach
    public void init() {
        this.invertBinaryTree = new InvertBinaryTree();
    }

    @Test
    public void sample1Test() {
        TreeNode root = new TreeNode(4);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(7);
        TreeNode ll = new TreeNode(1);
        TreeNode lr = new TreeNode(3);
        TreeNode rl = new TreeNode(6);
        TreeNode rr = new TreeNode(9);
        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        r.left = rl;
        r.right = rr;

        TreeNode actual = invertBinaryTree.solution(root);
        TreeNode expected = new TreeNode(4);
        TreeNode expectedl = new TreeNode(7);
        TreeNode expectedr = new TreeNode(2);
        TreeNode expectedll = new TreeNode(9);
        TreeNode expectedlr = new TreeNode(6);
        TreeNode expectedrl = new TreeNode(3);
        TreeNode expectedrr = new TreeNode(1);
        expected.left = expectedl;
        expected.right = expectedr;
        expectedl.left = expectedll;
        expectedl.right = expectedlr;
        expectedr.left = expectedrl;
        expectedr.right = expectedrr;

        assert (expected.val == actual.val);
        assert (expected.left.val == actual.left.val);
        assert (expected.right.val == actual.right.val);
        assert (expected.left.left.val == actual.left.left.val);
        assert (expected.left.right.val == actual.left.right.val);
        assert (expected.right.left.val == actual.right.left.val);
        assert (expected.right.right.val == actual.right.right.val);

    }

    @Test
    public void sample2Test() {
        assertNull(invertBinaryTree.solution(null));
    }

}
