package cn.crabime.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii
 */
public class BinaryTreeLevelOrderBottom {

    /**
     * 采用队列的思想，将每一层节点先存放到队列中，然后取出，队列又为空
     *     1
     *    / \
     *   2   3
     *
     * 1入队列，将1保存到list中，取出1节点，此时队列为空，判断左右孩子是否为空，
     * 不为空？左右孩子入队列，将左右孩子值存到新的一层中（oneLevel），存完后又取出，
     * 队列依次存入孩子的孩子。
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> list = new LinkedList<>();
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                List<Integer> oneLevel = new ArrayList<>();

                int levelCount = queue.size();
                for (int i = 0; i < levelCount; i++) {
                    // 将当前节点从队列中取出
                    TreeNode currentNode = queue.poll();

                    oneLevel.add(currentNode.val);

                    if (currentNode.left != null) {
                        queue.add(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.add(currentNode.right);
                    }
                }
                list.addFirst(oneLevel);
            }
        }
        return list;
    }


    public List<List<Integer>> levelOrderBottomDFS(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        DFS(root, 0, list);
        return list;
    }

    private void DFS(TreeNode root, int level, List<List<Integer>> ans) {
        if (root == null) {
            return;
        }
        if (ans.size() <= level) {
            ans.add(0, new ArrayList<>());
        }
        ans.get(ans.size() - level - 1).add(root.val);

        DFS(root.left, level + 1, ans);
        DFS(root.right, level + 1, ans);
    }
}
