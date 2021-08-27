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

    public static boolean wideSearch(Tree root, int num) {
        Queue<Tree> list = new LinkedList<>();
        list.offer(root);
        while (!list.isEmpty()) {
            Tree node = list.remove();
            if (num == node.value) {
                return true;
            }
            if (node.left != null) list.add(node.left);
            if (node.right != null) list.add(node.right);
        }
        return false;
    }

}
