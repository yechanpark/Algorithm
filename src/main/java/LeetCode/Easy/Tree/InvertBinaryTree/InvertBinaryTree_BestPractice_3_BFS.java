package LeetCode.Easy.Tree.InvertBinaryTree;

import LeetCode.Easy.Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Finally we can easily convert the above solution to BFS - or so called level order traversal.
 */
public class InvertBinaryTree_BestPractice_3_BFS {
    public TreeNode solution(TreeNode root) {
        if (root == null) {
            return null;
        }

        final Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            final TreeNode node = queue.poll();
            final TreeNode left = node.left;
            node.left = node.right;
            node.right = left;

            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }
}