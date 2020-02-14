package LeetCode.Easy.Tree.InvertBinaryTree;

import LeetCode.Easy.Tree.TreeNode;

/**
 * 키워드 - 트리, 이진트리, 트리뒤집기
 *
 * Invert a binary tree.
 *
 * Example:
 *
 * Input:
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * Output:
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * Trivia:
 * This problem was inspired by this original tweet by Max Howell:
 *
 * Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class InvertBinaryTree {
    public TreeNode solution(TreeNode root) {
        if (root == null) return null;

        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;

        solution(root.left);
        solution(root.right);

        return root;
    }
}