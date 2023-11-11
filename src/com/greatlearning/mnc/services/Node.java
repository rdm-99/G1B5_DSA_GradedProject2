package com.greatlearning.mnc.services;

public class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}
