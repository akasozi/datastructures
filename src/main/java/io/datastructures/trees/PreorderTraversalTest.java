package io.datastructures.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class PreorderTraversalTest {


    public static void main(String[] args) {
           // input: [1, null, 2, 3]
           // output: [1, 2, 3]
           TreeNode root = new TreeNode();
           root.val = 1;
           root.right = new TreeNode(2, new TreeNode(3), null);
           root.left = null;
           List<Integer> result = preorderTraversal(root);
           System.out.println(Arrays.toString((Object[])result.toArray()));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> list = new ArrayList<>();
         preorderTraversal(root, list);
         return list;
    }

    // recursive!
    public static void preorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;
        // root -> left -> right
        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);
    }
}
