package cn.crabime.practice.skiplist;

import java.util.ArrayList;
import java.util.List;

public class SkipListNode<E> {

    private E value;

    public List<SkipListNode<E>> nextNodes;

    public SkipListNode(E value) {
        this.value = value;
        this.nextNodes = new ArrayList<>();
    }

    public E getValue() {
        return value;
    }

    public int level() {
        return nextNodes.size() - 1;
    }

    public String toString() {
        return "SLN:" + this.value;
    }
}
