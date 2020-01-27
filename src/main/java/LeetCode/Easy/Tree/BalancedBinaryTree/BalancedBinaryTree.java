package LeetCode.Easy.Tree.BalancedBinaryTree;

import LeetCode.Easy.Tree.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.
 *
 * For this problem, a height-balanced binary tree is defined as:
 *
 * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 *
 *
 *
 * Example 1:
 *
 * Given the following tree [3,9,20,null,null,15,7]:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * Return true.
 *
 * Example 2:
 *
 * Given the following tree [1,2,2,3,3,null,null,4,4]:
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * Return false.
 */

public class BalancedBinaryTree {
    public boolean solution(TreeNode root) {
        // 비어있는 트리면 true 리턴
        if (root == null) return true;

        // 왼쪽 서브 트리의 Depth를 구함
        int leftDepth = getDepth(root.left);

        // 오른쪽 서브 트리의 Depth를 구함
        int rightDepth = getDepth(root.right);

        // 왼쪽 서브 트리와 오른쪽 서브 트리의 Depth 차이가 2 이상이면 false
        if (Math.abs(leftDepth-rightDepth) >= 2) return false;

        // 서브 트리 중에서 안 맞는게 있을 수 있으므로 왼쪽, 오른쪽 모두 검사
        return solution(root.left) && solution(root.right);
    }

    private int getDepth(TreeNode node) {
        // 현재 node가 null이면 0 리턴
        if (node == null) return 0;

        // null이 아니면 최소 depth는 1임
        int depth = 1;

        // 왼쪽 서브 트리의 Depth를 구함
        int leftDepth = getDepth(node.left);

        // 오른쪽 서브 트리의 Depth를 구함
        int rightDepth = getDepth(node.right);

        // 둘 중 큰 것을 리턴
        return Math.max(leftDepth + depth, rightDepth + depth);
    }
}

/**
 * 키워드 - 트리, 트리깊이, 이진트리, 높이 균형 트리(Height-Balanced Tree)
 */