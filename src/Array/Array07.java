/*
Question 7: Check if Array is Sorted
Task: Given int[] numbers = {3, 7, 12, 19, 25};, check whether the array is sorted in ascending order. Print "Array is sorted" or "Array is not sorted".

Hint: Loop from index 0 to length - 2 and check if numbers[i] > numbers[i + 1].

Expected Output:
Array is sorted
*/
package Array;
public class Array0 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 12, 19, 25};
        boolean status = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                status = false;
            }
        }
        if (status) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
