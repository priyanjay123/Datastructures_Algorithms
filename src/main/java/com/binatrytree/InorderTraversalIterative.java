package com.binatrytree;

import java.util.Stack;

public class InorderTraversalIterative {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        inorderIterative(root);
    }

    // TC : O(n)
    // SC : O(n) for skewed tree
    private static void inorderIterative(Node root) {
        Stack<Node> st = new Stack<>();
        Node curr = root;

        while (!st.empty() || curr != null) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                curr = st.pop();
                System.out.print(curr.data + " ");
                curr = curr.right;
            }
        }
    }

}
