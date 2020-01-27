package leetcode.easy.maximumdepthofbinarytree;

import leetcode.common.TreeNode;

/**
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 */

public class MaximumDepthOfBinaryTree {
    public int solution(TreeNode root) {
        int depth = 0;

        // 만약 현재 노드가 null이면 0을 리턴
        if (root == null) {
            return 0;
        }

        // 현재 노드에 대해 깊이 1 추가
        depth++;

        // 왼쪽 서브 트리 노드 깊이를 구함
        int leftDepth = solution(root.left);
        // 오른쪽 서브 트리 노드 깊이를 구함
        int rightDepth = solution(root.right);

        // 오른쪽이 더 큰 경우 오른쪽 서브 트리 노드 깊이를 추가
        if (rightDepth > leftDepth) depth += rightDepth;

        // 왼쪽이 더 큰 경우 왼쪽 서브 트리 노드 깊이를 추가
        if (leftDepth >= rightDepth) depth += leftDepth;

        // 하위 트리의 깊이를 포함한 길이 추가
        return depth;
    }
}

/**
 * 키워드 - 트리, 트리깊이, 이진트리
 */