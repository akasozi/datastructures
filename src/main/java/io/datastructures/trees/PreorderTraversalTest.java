package io.datastructures.trees;

import java.util.*;

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
           // List<Integer> result = preorderTraversal(root);
           List<Integer> result = postOrderTraversalIterative(root);
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

    public static List<Integer> postOrderTraversalIterative(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        if (root != null) {
            stack.addFirst(root);
        }

        TreeNode current;
        while (!stack.isEmpty()) {
            current = stack.removeFirst();
            list.add(current.val);
            if (current.right != null) {
                stack.addFirst(current.right);
            }
            if(current.left != null) {
                stack.addFirst(current.left);
            }
        }
        return list;
    }
}
