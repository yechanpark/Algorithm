package LeetCode.Easy.Tree.BalancedBinaryTree;

import LeetCode.Easy.Tree.TreeNode;

/**
 * 공식키워드 - Tree, Depth First Search
 *
 * based on DFS.
 * Instead of calling depth() explicitly for each child node, we return the height of the current node in DFS recursion.
 * When the sub tree of the current node (inclusive) is balanced, the function dfsHeight() returns a non-negative value as the height. Otherwise -1 is returned.
 * According to the leftHeight and rightHeight of the two children, the parent node could check if the sub tree is balanced, and decides its return value.
 */

public class BalancedBinaryTree_BestPractice {
    public boolean solution(TreeNode root) {
        return dfsHeight(root) != -1;
    }

    private int dfsHeight(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = dfsHeight(root.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}