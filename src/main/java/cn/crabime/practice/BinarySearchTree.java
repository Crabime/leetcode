package cn.crabime.practice;

/**
 * 二叉查找数
 */
public class BinarySearchTree {

    private BinaryNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    /**
     * 二叉查找树查找方法
     */
    public boolean contains(int data) {
        return contains(data, root);
    }

    public int findMin() {
       return findMin(root);
    }

    public int findMax() {
        return findMax(root);
    }

    public void insert(int data) {
        root = insert(data, root);
    }

    // TODO: 10/24/19 增加二叉查找树删除操作
    public boolean remove(int data) {
        return false;
    }

    private BinaryNode insert(int data, BinaryNode node) {
        if (node == null) {
            return new BinaryNode(data);
        }

        if (node.data > data) {
            node.leftNode = insert(data, node.leftNode);
        } else if (node.data < data) {
            node.rightNode = insert(data, node.rightNode);
        }

        return node;
    }

    private boolean contains(int data, BinaryNode node) {
        if (node == null) {
            return false;
        }

        if (node.data < data) {
            return contains(data, node.rightNode);
        } else if (node.data > data) {
            return contains(data, node.leftNode);
        } else {
            return true;
        }
    }

    private int findMin(BinaryNode node) {
        if (node == null) {
            return -1;
        } else if (node.leftNode == null) {
            return node.data;
        } else {
            return findMin(node.leftNode);
        }
    }

    private int findMax(BinaryNode node) {
        if (node != null) {
            while (node.rightNode != null) {
                node = node.rightNode;
            }
            return node.data;
        }
        return -1;
    }

    class BinaryNode {
        BinaryNode leftNode;

        BinaryNode rightNode;

        int data;

        public BinaryNode(int data) {
            this.leftNode = null;
            this.rightNode = null;
            this.data = data;
        }
    }

}
