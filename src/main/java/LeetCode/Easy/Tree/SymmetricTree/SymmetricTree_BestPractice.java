package LeetCode.Easy.Tree.SymmetricTree;

import LeetCode.Easy.Tree.TreeNode;

/**
 *
 */
public class SymmetricTree_BestPractice {

    public boolean solution(TreeNode root) {
        return root == null || isSymmetricHelp(root.left, root.right);
    }

    private boolean isSymmetricHelp(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        if (left.val != right.val)
            return false;
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }
}