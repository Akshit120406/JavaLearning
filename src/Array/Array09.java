/*
Question 9: Finding the Second Largest Element
Task: Given int[] arr = {12, 35, 1, 10, 34, 1};, find the second largest distinct number in the array.

Hint: Track two variables: largest and secondLargest.

Expected Output:
Second Largest: 34
*/
package Array;
public class Array09 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int max = arr[0], secMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        if (max == arr[0]) {
            secMax = arr[1];
        } else {
            secMax = arr[0];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                continue;
            }
            if (secMax < arr[i]) {
                secMax = arr[i];
            }
        }
        System.out.println("Second Largest: " + secMax);
    }
}
