package io.datastructures.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class PostorderTraversalTest {
    public static void main(String[] args) {
        // input: [1, null, 2, 3]
        // output: [3, 2, 1]
        TreeNode root = new TreeNode();
        root.val = 1;
        root.right = new TreeNode(2, new TreeNode(3), null);
        root.left = null;
        List<Integer> result = postorderTraversal(root);
        System.out.println(Arrays.toString((Object[])result.toArray()));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        // left -> right -> root
        postorderTraversal(root, list);
        return list;
    }

    public static void postorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;
        postorderTraversal(root.left, list);
        postorderTraversal(root.right, list);
        list.add(root.val);
    }
}
