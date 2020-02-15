package LeetCode.Easy.Tree.LowestCommonAncestorOfABinarySearchTree;

import LeetCode.Easy.Tree.TreeNode;

/**
 * 공식키워드 - Tree, LCA
 * <p>
 * Just walk down from the whole tree's root as long as both p and q are in the same subtree (meaning their values are both smaller or both larger than root's).
 * This walks straight from the root to the LCA, not looking at the rest of the tree, so it's pretty much as fast as it gets.
 */
public class LowestCommonAncestorOfABinarySearchTree_BestPractice {

    public TreeNode solution(TreeNode root, TreeNode p, TreeNode q) {
        while ((root.val - p.val) * (root.val - q.val) > 0)
            root = p.val < root.val ? root.left : root.right;
        return root;
    }
}