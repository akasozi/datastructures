package io.datastructures.stacks;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class ReverseArrayTest {
    public static void main(String[] args) {
        String[] nums = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
        LinkedListStack<String> stack = new LinkedListStack<>();

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
