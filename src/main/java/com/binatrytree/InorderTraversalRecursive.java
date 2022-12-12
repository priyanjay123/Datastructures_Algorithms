package com.binatrytree;

class Node{
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

// TC : O(n)
// SC : O(n) for skewed tree
public class InorderTraversalRecursive {
    private static void inorder(Node root) {
        if(root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        inorder(root);
    }

}
