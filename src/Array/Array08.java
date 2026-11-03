/*
Question 8: Count Occurrence of an Element
Task: Given int[] values = {2, 5, 2, 8, 2, 9, 1}; and int key = 2;, count how many times key appears in values.

Expected Output:
Key 2 appears 3 times
*/
package Array;
public class Array08 {
    public static void main(String[] args) {
        int[] values = {2, 5, 2, 8, 2, 9, 1};
        int key = 2, count = 0;
        for (int i = 0; i < values.length; i++) {
            if (key == values[i]) {
                count++;
            }
        }
        System.out.println("Key " + key + " appears " + count + " times");
    }
}
