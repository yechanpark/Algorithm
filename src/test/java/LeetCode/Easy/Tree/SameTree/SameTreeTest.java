package LeetCode.Easy.Tree.SameTree;

import LeetCode.Easy.Tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SameTreeTest {
    private SameTree sameTree;

    @BeforeEach
    public void init() {
        this.sameTree = new SameTree();
    }

    @Test
    public void sample1Test() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node1left = new TreeNode(2);
        TreeNode node1right = new TreeNode(3);
        node1.left = node1left;
        node1.right = node1right;

        TreeNode node2 = new TreeNode(1);
        TreeNode node2left = new TreeNode(2);
        TreeNode node2right = new TreeNode(3);
        node2.left = node2left;
        node2.right = node2right;

        boolean actual = sameTree.solution(node1, node2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node1left = new TreeNode(2);
        node1.left = node1left;

        TreeNode node2 = new TreeNode(1);
        TreeNode node2right = new TreeNode(2);
        node2.right = node2right;

        boolean actual = sameTree.solution(node1, node2);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node1left = new TreeNode(2);
        TreeNode node1right = new TreeNode(1);
        node1.left = node1left;
        node1.right = node1right;

        TreeNode node2 = new TreeNode(1);
        TreeNode node2left = new TreeNode(1);
        TreeNode node2right = new TreeNode(2);
        node2.left = node2left;
        node2.right = node2right;

        boolean actual = sameTree.solution(node1, node2);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node1left = new TreeNode(2);
        TreeNode node1right = new TreeNode(1);
        node1.left = node1left;
        node1.right = node1right;

        TreeNode node2 = new TreeNode(1);
        TreeNode node2right = new TreeNode(2);
        node2.right = node2right;

        boolean actual = sameTree.solution(node1, node2);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
