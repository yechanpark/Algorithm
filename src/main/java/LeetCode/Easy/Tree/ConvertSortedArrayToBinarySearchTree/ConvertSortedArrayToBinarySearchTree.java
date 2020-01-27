package LeetCode.Easy.Tree.ConvertSortedArrayToBinarySearchTree;

import LeetCode.Easy.Tree.TreeNode;

/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 *
 * Given the sorted array: [-10,-3,0,5,9],
 *
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode solution(int[] nums) {
        int numsLength = nums.length;

        switch (numsLength) {
            case 0: return null;
            case 1: return new TreeNode(nums[0]);
        }

        int left    = 0;
        int right   = numsLength - 1;
        int mid     = right / 2;

        TreeNode rootNode = new TreeNode(nums[mid]);
        if( mid != 0 ) {
            // 왼쪽 서브 배열
            int[] leftNums = new int[mid];

            // nums배열의 left 인덱스부터 mid갯수 만큼 leftNums의 0번 인덱스부터 복사
            System.arraycopy(nums, left, leftNums, 0, mid);

            // 왼쪽 서브 배열(leftNums)에서 선정된 루트(leftNums[mid])를 연결
            rootNode.left = solution(leftNums);
        }

        // 오른쪽 서브 배열의 길이
        int rightNumsLength = right - mid;
        if ( rightNumsLength != 0 ) {
            // 오른쪽 서브 배열
            int[] rightNums = new int[rightNumsLength];

            // nums배열의 mid + 1인덱스부터 rightNumsLength갯수 만큼 rightNums의 0번 인덱스부터 복사
            System.arraycopy(nums, mid + 1, rightNums, 0, rightNumsLength);

            // 오른쪽 서브 배열(rightNums)에서 선정된 루트(rightNums[mid])를 연결
            rootNode.right = solution(rightNums);
        }

        return rootNode;
    }
}

/**
 * 키워드 - 트리, 이진트리, 이진탐색트리, 이진탐색
 */