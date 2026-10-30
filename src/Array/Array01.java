/*
Question 1: Element Access & Modification
Task: Declare an array int[] nums = {10, 20, 30, 40, 50};. Change the element at index 2 to 99. Print the entire array elements on a single line separated by spaces using a loop.

Expected Output:
10 20 99 40 50
*/
package Array;
public class Array01 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        nums[2] = 99;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
