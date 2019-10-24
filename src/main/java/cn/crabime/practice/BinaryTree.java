package cn.crabime.practice;

import java.util.LinkedList;

public class BinaryTree {

    private LinkedList<Node> linkedList;

    public BinaryTree(int[] arr) {

        linkedList = new LinkedList<Node>();

        for (int i = 0; i < arr.length; i++) {
            linkedList.add(new Node(arr[i]));
        }

        // 初始化二叉树
        for (int parentIndex = 0; parentIndex < (arr.length/2 - 1); parentIndex++) {
            linkedList.get(parentIndex).leftNode = linkedList.get(parentIndex * 2 + 1);
            linkedList.get(parentIndex).rightNode = linkedList.get(parentIndex * 2 + 2);
        }

        // 对所有元素赋值
        int lastParentIndex = arr.length/2 - 1;
        linkedList.get(lastParentIndex).leftNode = linkedList.get(lastParentIndex * 2 + 1);
        if (arr.length % 2 == 1) {
            linkedList.get(lastParentIndex).rightNode = linkedList.get(lastParentIndex * 2 + 2);
        }
    }

    class Node {
        Node leftNode;

        Node rightNode;

        int data;

        public Node(int data) {
            this.leftNode = null;
            this.rightNode = null;
            this.data = data;
        }
    }
}
