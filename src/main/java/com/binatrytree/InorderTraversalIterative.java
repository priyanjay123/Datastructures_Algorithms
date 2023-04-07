package com.binatrytree;

import java.util.Stack;

public class InorderTraversalIterative {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        inorderIterative(root);
    }

    // TC : O(n)
    // SC : O(n) for skewed tree
    private static void inorderIterative(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;

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
