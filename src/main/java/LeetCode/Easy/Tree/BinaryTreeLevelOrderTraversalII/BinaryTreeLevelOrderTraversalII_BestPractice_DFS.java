package LeetCode.Easy.Tree.BinaryTreeLevelOrderTraversalII;

import LeetCode.Easy.Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 공식키워드 - Tree, Breadth First Search, Depth First Search
 */
public class BinaryTreeLevelOrderTraversalII_BestPractice_DFS {
    public List<List<Integer>> solution(TreeNode root) {
        List<List<Integer>> wrapList = new LinkedList<>();
        levelMaker(wrapList, root, 0);
        return wrapList;
    }

    private void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
        if (root == null) return;
        if (level >= list.size()) {
            list.add(0, new LinkedList<>());
        }
        levelMaker(list, root.left, level + 1);
        levelMaker(list, root.right, level + 1);
        list.get(list.size() - level - 1).add(root.val);
    }
}