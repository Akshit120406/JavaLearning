/*
 10: Array Element Shift (Left Shift)
Task: Given int[] arr = {10, 20, 30, 40, 50};, shift all elements to the left by 1 position. The first element (10) should move to the end of the array. Print the updated array.

Expected Output:
20 30 40 50 10
*/
package Array;
public class Array10 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}