package LeetCode.Easy.Tree.BinaryTreePaths;

import LeetCode.Easy.Tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathsTest {
    private BinaryTreePaths binaryTreePaths;

    @BeforeEach
    public void init() {
        this.binaryTreePaths = new BinaryTreePaths();
    }

    @Test
    public void sample1Test() {
        TreeNode root = new TreeNode(1);
        TreeNode root1l = new TreeNode(2);
        TreeNode root1r = new TreeNode(3);
        TreeNode root1lr = new TreeNode(5);
        root.left = root1l;
        root.right = root1r;
        root1l.right = root1lr;

        List<String> actual = binaryTreePaths.solution(root);
        List<String> expected = new ArrayList<>();
        expected.add("1->2->5");
        expected.add("1->3");

        boolean result = false;
        for (String a : actual) {
            for (String e : expected) {
                if (a.equals(e)) {
                    result = true;
                    break;
                }
            }

            if (!result) {
                break;
            }

        }

        assert (result);
    }

}
