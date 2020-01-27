package leetcode.easy.symmetrictree;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SymmetricTreeTest {
    private SymmetricTree symmetricTree;

    @BeforeEach
    public void init() {
        this.symmetricTree = new SymmetricTree();
    }

    @Test
    public void sample1Test() {
        TreeNode root = new TreeNode(1);
        TreeNode root1l = new TreeNode(2);
        TreeNode root1r = new TreeNode(2);
        TreeNode root1ll = new TreeNode(3);
        TreeNode root1lr = new TreeNode(4);
        TreeNode root1rl = new TreeNode(4);
        TreeNode root1rr = new TreeNode(3);
        root.left = root1l;
        root.right = root1r;
        root1l.left = root1ll;
        root1l.right = root1lr;
        root1r.left = root1rl;
        root1r.right = root1rr;

        boolean actual = symmetricTree.solution(root);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        TreeNode root = new TreeNode(1);
        TreeNode root1l = new TreeNode(2);
        TreeNode root1r = new TreeNode(2);
        TreeNode root1lr = new TreeNode(3);
        TreeNode root1rr = new TreeNode(3);
        root.left = root1l;
        root.right = root1r;
        root1l.right = root1lr;
        root1r.right = root1rr;

        boolean actual = symmetricTree.solution(root);
        boolean expected = false;
        assertEquals(expected, actual);
    }

}
