package io.datastructures.stacks;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class ReverseArrayTest {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        LinkedListStack<Integer> stack = new LinkedListStack<>();

        for (int i = 0; i < nums.length; i++) {
            stack.push(nums[i]);
        }

        int j = 0;
        while (!stack.isEmpty()) {
            nums[j++] = stack.pop();
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
