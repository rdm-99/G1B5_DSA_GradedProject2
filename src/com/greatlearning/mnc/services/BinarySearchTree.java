package com.greatlearning.mnc.services;

import java.util.ArrayList;

public class BinarySearchTree {
    public static ArrayList<Integer> traversal(Node tree) {
        ArrayList<Integer> left;
        ArrayList<Integer> right;

        if (tree == null) {
            return new ArrayList<>();
        }

        left = traversal(tree.left);
        left.add(tree.data);
        right = traverseRight(tree.right);
        left.addAll(right);
        return left;
    }

    public static ArrayList<Integer> traverseRight(Node tree) {
        ArrayList<Integer> temp;
        ArrayList<Integer> temp2;
        if (tree == null) {
            return new ArrayList<>();
        }
        temp = traverseLeft(tree.left);
        ArrayList<Integer> temp1 = new ArrayList<>(temp);
        temp1.add(tree.data);
        temp2 = traverseRight(tree.right);
        temp1.addAll(temp2);
        return temp1;
    }

    public static ArrayList<Integer> traverseLeft(Node tree) {
        ArrayList<Integer> temp;
        if (tree == null) {
            return new ArrayList<>();
        }
        temp = traverseLeft(tree.left);
        temp.add(tree.data);
        return temp;
    }
}
