package model;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Tree(int value) {
        this.value = value;
    }

    public static int sumWide(Tree root) {
        Queue<Tree> list = new LinkedList<>();
        list.add(root);

        int sum = 0;
        while (!list.isEmpty()) {
            Tree node = list.remove();
            sum = sum + node.value;
            if (node.left != null) list.add(node.left);
            if (node.right != null) list.add(node.right);
        }
        return sum;
    }

}
