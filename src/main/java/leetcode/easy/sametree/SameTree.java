package leetcode.easy.sametree;

import leetcode.common.TreeNode;

/**
 * Given two binary trees, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 *
 * Example 1:
 *
 * Input:     1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 *
 * Output: true
 * Example 2:
 *
 * Input:     1         1
 *           /           \
 *          2             2
 *
 *         [1,2],     [1,null,2]
 *
 * Output: false
 * Example 3:
 *
 * Input:     1         1
 *           / \       / \
 *          2   1     1   2
 *
 *         [1,2,1],   [1,1,2]
 *
 * Output: false
 */

public class SameTree {
    public boolean solution(TreeNode p, TreeNode q) {
        // 둘 다 null이면 true 리턴
        if (p == null && q == null){
            return true;
        }

        // 위에서 둘 다 null인 경우를 체크했으므로, 여기까지 왔다면 둘 중 하나는 null이 아니다.
        // 따라서 둘 중 하나라도 null인 경우가 있다면 반대는 null이 아니므로, 서로 다르다.
        else if (p == null || q == null) {
            return false;
        }

        // 이 아래는 둘 다 null이 아닌 경우

        // 값이 다르면 false 리턴
        if (p.val != q.val) {
            return false;
        }

        // 왼쪽 비교
        if (!solution(p.left, q.left)) {
            return false;
        }

        // 오른쪽 비교의 결과가 최종 결과가 됨
        return solution(p.right, q.right);

    }
}

/**
 * 키워드 - 트리, 트리순회, 깊이 우선 탐색 알고리즘(DFS, Depth First Search)
 */