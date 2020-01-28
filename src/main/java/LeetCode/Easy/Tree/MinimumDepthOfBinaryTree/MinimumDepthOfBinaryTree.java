package LeetCode.Easy.Tree.MinimumDepthOfBinaryTree;

import LeetCode.Easy.Tree.TreeNode;

/**
 * Given a binary tree, find its minimum depth.
 *
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
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
 * return its minimum depth = 2.
 */

public class MinimumDepthOfBinaryTree {
    public int solution(TreeNode root) {
        // 현재 검사하는 노드가 null이면 0 리턴
        if (root == null) return 0;

        // 현재 노드의 왼쪽에 대한 깊이를 검사
        int leftDepth = solution(root.left);

        // 현재 노드의 오른쪽에 대한 깊이를 검사
        int rightDepth = solution(root.right);


        // 왼쪽이 null이면 오른쪽깊이 + 1(자신의 깊이)
        if (root.left == null) return rightDepth + 1;

        // 오른쪽이 null이면 왼쪽깊이 + 1(자신의 깊이)
        if (root.right == null) return leftDepth + 1;

        // 둘 다 null이 아닌 경우 최소값 + 1(자신의 깊이)을 리턴
        return Math.min(leftDepth, rightDepth) + 1;

    }
}

/**
 * 키워드 - 트리, 트리깊이, 이진트리, 깊이 우선 탐색 알고리즘 (DFS, Depth First Search)
 */