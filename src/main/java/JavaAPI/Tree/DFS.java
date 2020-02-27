package JavaAPI.Tree;

import LeetCode.Easy.Tree.TreeNode;

/**
 * 깊이 우선 순회 DFS (Depth First Search)
 */
public class DFS {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        TreeNode leftleft = new TreeNode(3);
        TreeNode leftright = new TreeNode(4);
        TreeNode rightleft = new TreeNode(5);
        TreeNode rightright = new TreeNode(6);
        root.left = left;
        root.right = right;
        left.left = leftleft;
        left.right = leftright;
        right.left = rightleft;
        right.right = rightright;

        dfsSearch(root);
    }

    // Recursive Call을 활용한 DFS
    public static void dfsSearch(TreeNode currentNode) {
        if (currentNode == null) {
            return;
        }

        System.out.print(currentNode.val);
        if (currentNode.left  != null) dfsSearch(currentNode.left);
        if (currentNode.right != null) dfsSearch(currentNode.right);
    }
}
