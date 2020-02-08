package LeetCode.Easy.Tree.PathSum;

import LeetCode.Easy.Tree.TreeNode;

/**
 * 공식키워드 - Tree, Depth First Search
 */
public class PathSum_BestPractice {
    public boolean solution(TreeNode root, int sum) {
        if (root == null) return false;

        if (root.left == null && root.right == null && sum - root.val == 0) return true;

        return solution(root.left, sum - root.val) || solution(root.right, sum - root.val);
    }
}