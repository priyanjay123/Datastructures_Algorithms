package com.binatrytree;

import java.util.Stack;

public class PreorderTraversalIterative {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        preorderIterative(root);
    }

    // TC : O(n)
    // SC : O(n) for skewed tree
    private static void preorderIterative(Node root) {
        if (root == null)
            return;

        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.empty()) {
            Node curr = st.pop();
            System.out.print(curr.data + " ");

            if (curr.right != null) {
                st.push(curr.right);
            }
            if (curr.left != null) {
                st.push(curr.left);
            }
        }
    }

}
