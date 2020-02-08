package LeetCode.Easy.Tree.MinimumDepthOfBinaryTree;

import LeetCode.Easy.Tree.TreeNode;

/**
 * 공식키워드 - Tree, Depth First Search, Breadth First Search
 */
public class MinimumDepthOfBinaryTree_BestPractice {
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