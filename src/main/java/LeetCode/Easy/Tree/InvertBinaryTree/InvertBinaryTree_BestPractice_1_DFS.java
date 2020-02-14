package LeetCode.Easy.Tree.InvertBinaryTree;

import LeetCode.Easy.Tree.TreeNode;

/**
 * Lets start with straightforward - recursive DFS - it's easy to write and pretty much concise.
 */
public class InvertBinaryTree_BestPractice_1_DFS {
    public TreeNode solution(TreeNode root) {
        if (root == null) {
            return null;
        }

        final TreeNode left = root.left, right = root.right;
        root.left = solution(right);
        root.right = solution(left);
        return root;
    }
}