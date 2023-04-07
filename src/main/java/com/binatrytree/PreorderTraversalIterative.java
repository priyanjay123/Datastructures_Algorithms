package com.binatrytree;

import java.util.Stack;

public class PreorderTraversalIterative {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        preorderIterative(root);
    }

    // TC : O(n)
    // SC : O(n) for skewed tree
    private static void preorderIterative(TreeNode root) {
        if (root == null)
            return;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.empty()) {
            TreeNode curr = st.pop();
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
