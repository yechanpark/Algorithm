package LeetCode.Easy.Tree.MaximumDepthOfBinaryTree;

import LeetCode.Easy.Tree.TreeNode;

/**
 * 공식키워드 - Tree, Depth First Search
 */
public class MaximumDepthOfBinaryTree_BestPractice {
    public int solution(TreeNode root) {
        if (root == null) return 0;
        int left = solution(root.left);
        int right = solution(root.right);
        return (left == 0 || right == 0)
                ? left + right + 1
                : Math.min(left, right) + 1;
    }
}