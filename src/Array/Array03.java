/* Question 3: Finding the Maximum Element
Task: Given int[] arr = {14, 52, 88, 31, 9, 74};, write a loop to find and print the largest number in the array.

Hint: Assume int max = arr[0]; initially, then loop from index 1 to compare and update max.

Expected Output:
Maximum value: 88 */
package Array;
public class Array03 {
    public static void main(String[] args) {
        int[] arr = {14, 52, 88, 31, 9, 74};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }
}
