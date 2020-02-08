package LeetCode.Easy.Tree.SameTree;

import LeetCode.Easy.Tree.TreeNode;

/**
 * 공식키워드 - Tree, Depth First Search
 */
public class SameTree_BestPractice {
    public boolean solution(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val == q.val)
            return solution(p.left, q.left) && solution(p.right, q.right);
        return false;
    }
}