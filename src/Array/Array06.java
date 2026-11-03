/*
Question 6: Reversing an Array
Task: Given int[] original = {1, 2, 3, 4, 5};, create a new array int[] reversed of the same size and copy elements into it in reverse order. Print the reversed array elements.

Expected Output:
5 4 3 2 1
*/
package Array;
public class Array06 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] rev = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            for (int j = original.length - i - 1; j >= 0; j--) {
                rev[i] = original[j];
                break;
            }
        }
        for (int i = 0; i < original.length; i++) {
            System.out.print(rev[i] + " ");
        }
    }
}
