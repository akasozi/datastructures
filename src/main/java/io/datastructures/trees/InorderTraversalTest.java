package io.datastructures.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class InorderTraversalTest {
    public static void main(String[] args) {

        // input: [1, null, 2, 3]
        // output: [1, 3, 2]
        TreeNode root = new TreeNode();
        root.val = 1;
        root.right = new TreeNode(2, new TreeNode(3), null);
        root.left = null;
        List<Integer> result = inorderTraversal(root);
        System.out.println(Arrays.toString((Object[])result.toArray()));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        return list;
    }

    public static void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;
        // left -> root -> right
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }
}
