package cn.crabime.practice;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * 说明:
 *
 * 如果你可以运用递归和迭代两种方法解决这个问题，会很加分。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/symmetric-tree
 */
public class BinaryTreeSymmetricQuestion {

    public boolean isSymmetric(TreeNode root) {
        // leetcode判定null也是对称的
        if (root == null) {
            return true;
        }
        TreeNode l = root.left;
        TreeNode r = root.right;
        return isSameTree(l, r);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            return isSameTree(p.left, q.right) && isSameTree(p.right, q.left) && p.val == q.val;
        } else return p == null && q == null;

    }
}
