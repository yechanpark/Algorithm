package LeetCode.Easy.Tree.BinaryTreePaths;

import LeetCode.Easy.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 키워드 - 트리, 이진트리
 *
 * Given a binary tree, return all root-to-leaf paths.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Input:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * Output: ["1->2->5", "1->3"]
 *
 * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */

public class BinaryTreePaths {
    private List<String> result = new ArrayList<>();

    public List<String> solution(TreeNode root) {
        helper(root, new StringBuilder());
        return result;
    }

    private void helper(TreeNode root, StringBuilder subResult) {
        if (root == null) return;
        if (subResult.toString().equals("")) {
            subResult.append(root.val);
        }
        else
            subResult.append("->").append(root.val);

        if (root.left != null)
            helper(root.left, new StringBuilder(subResult));

        if (root.right != null)
            helper(root.right, new StringBuilder(subResult));

        if (root.left == null && root.right == null)
            result.add(subResult.toString());
    }
}