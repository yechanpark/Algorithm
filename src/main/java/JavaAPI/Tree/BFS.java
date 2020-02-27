package JavaAPI.Tree;

import LeetCode.Easy.Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 너비 우선 순회 BFS (Breadth First Search)
 */
public class BFS {
    static Queue<TreeNode> queue = new LinkedList<>();

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

        bfsSearch(root);
    }

    public static void bfsSearch(TreeNode currentNode) {
        // 현재 노드가 null이면 순회를 종료한다.
        if (currentNode == null) {
            return;
        }

        // 현재 노드의 값을 출력
        System.out.print(currentNode.val);

        // 현재 노드의 왼쪽이 존재하는 경우 먼저 큐에 넣음
        if (currentNode.left != null)
            queue.add(currentNode.left);

        // 현재 노드의 오른쪽이 존재하는 경우 먼저 큐에 넣음
        if (currentNode.right != null)
            queue.add(currentNode.right);

        // 큐가 비어 있으면 종료
        if (queue.isEmpty()) return;

        // 큐에서 하나 꺼내서 다시 순회 시작
        TreeNode nextNode = queue.poll();
        bfsSearch(nextNode);

    }
}
