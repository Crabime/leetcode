package cn.crabime.practice;

import java.util.LinkedList;

/**
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例: 
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum
 */
public class BinaryHasSumPath {

    /**
     * 单纯的采用递归的思想来完成
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        int target = sum - root.val;
        if (root.left == null && root.right == null) {
            return target == 0;
        }
        return hasPathSum(root.left, target) || hasPathSum(root.right, target);
    }

    /**
     * 采用迭代的思想来完成二叉树遍历
     */
    public boolean hasPathSumUsingIterator(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        LinkedList<TreeNode> nodeStack = new LinkedList<>();
        LinkedList<Integer> valueList = new LinkedList<>();
        nodeStack.add(root);
        valueList.add(sum - root.val);

        TreeNode curNode;
        int curValue;
        while (!nodeStack.isEmpty()) {
            curNode = nodeStack.pollLast();
            curValue = valueList.pollLast();
            if (curNode.left == null && curNode.right == null && curValue == 0) {
                return true;
            }

            if (curNode.left != null) {
                nodeStack.add(curNode.left);
                valueList.add(curValue - curNode.left.val);
            }

            if (curNode.right != null) {
                nodeStack.add(curNode.right);
                valueList.add(curValue - curNode.right.val);
            }
        }

        return false;
    }
}
