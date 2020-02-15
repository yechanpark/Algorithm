package LeetCode.Easy.Tree.BinaryTreePaths;

import LeetCode.Easy.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 공식키워드 - Tree, DFS(Depth First Search)
 */

public class BinaryTreePaths_BestPractice {

    public List<String> solution(TreeNode root) {
        List<String> answer = new ArrayList<>();
        if (root != null) searchBT(root, "", answer);
        return answer;
    }

    private void searchBT(TreeNode root, String path, List<String> answer) {
        if (root.left == null && root.right == null) answer.add(path + root.val);
        if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
        if (root.right != null) searchBT(root.right, path + root.val + "->", answer);
    }
}