package LeetCode.Easy.Tree.LowestCommonAncestorOfABinarySearchTree;

import LeetCode.Easy.Tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestCommonAncestorOfABinarySearchTreeTest {
    private LowestCommonAncestorOfABinarySearchTree lowestCommonAncestorOfABinarySearchTree;

    @BeforeEach
    public void init() {
        this.lowestCommonAncestorOfABinarySearchTree = new LowestCommonAncestorOfABinarySearchTree();
    }

    @Test
    public void sample1Test() {
        TreeNode root = new TreeNode(6);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        TreeNode ll = new TreeNode(0);
        TreeNode lr = new TreeNode(4);
        TreeNode rl = new TreeNode(7);
        TreeNode rr = new TreeNode(9);
        TreeNode lrl = new TreeNode(3);
        TreeNode lrr = new TreeNode(5);
        root.left = p;
        root.right = q;
        p.left = ll;
        p.right = lr;
        q.left = rl;
        q.right = rr;
        lr.left = lrl;
        lr.right = lrr;

        TreeNode actual = lowestCommonAncestorOfABinarySearchTree.solution(root, p, q);

        assertEquals(actual, root);

    }

    @Test
    public void sample2Test() {
        TreeNode root = new TreeNode(6);
        TreeNode p = new TreeNode(2);
        TreeNode r = new TreeNode(8);
        TreeNode ll = new TreeNode(0);
        TreeNode q = new TreeNode(4);
        TreeNode rl = new TreeNode(7);
        TreeNode rr = new TreeNode(9);
        TreeNode lrl = new TreeNode(3);
        TreeNode lrr = new TreeNode(5);
        root.left = p;
        root.right = r;
        p.left = ll;
        p.right = q;
        r.left = rl;
        r.right = rr;
        q.left = lrl;
        q.right = lrr;

        TreeNode actual = lowestCommonAncestorOfABinarySearchTree.solution(root, p, q);
        assertEquals(actual, p);

    }

    @Test
    public void sample3Test() {
        TreeNode root = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        root.left = q;

        TreeNode actual = lowestCommonAncestorOfABinarySearchTree.solution(root, root, q);
        assertEquals(actual, root);
    }

    @Test
    public void sample4Test() {
        TreeNode root = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        TreeNode p = new TreeNode(3);
        root.left = q;
        root.right = p;

        TreeNode actual = lowestCommonAncestorOfABinarySearchTree.solution(root, p, q);
        assertEquals(actual, root);
    }

    @Test
    public void sample5Test() {
        TreeNode root = new TreeNode(3);
        TreeNode l = new TreeNode(1);
        TreeNode q = new TreeNode(4);
        TreeNode p = new TreeNode(2);
        root.left = l;
        root.right = q;
        l.right = p;

        TreeNode actual = lowestCommonAncestorOfABinarySearchTree.solution(root, p, q);
        assertEquals(actual, root);
    }
}
