/* Question 5: Linear Search
Task: Given int[] data = {4, 8, 15, 16, 23, 42}; and int target = 16;, search for target. Print its index if found ("Found at index: 3"). If not found after searching the entire array, print "Not found".

Expected Output:
Found at index: 3
*/
package Array;
public class Array05 {
    public static void main(String[] args) {
        int[] data = {4, 8, 15, 16, 23, 42};
        int target = 16, a = 0;
        boolean status = false;
        for (int i = 0; i < data.length; i++) {
            if (target == data[i]) {
                status = true;
                a = i;
                break;
            }
        }
        if (status) {
            System.out.println("Found at index: " + a);
        } else {
            System.out.println("Not found");
        }
    }
}
