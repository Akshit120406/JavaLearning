/* Question 2: Sum & Average of Array Elements
Task: Given double[] prices = {12.5, 45.0, 23.5, 8.0, 11.0};, compute the sum and average of all prices.

Expected Output:
Sum: 100.0
Average: 20.0 */
package Array;
public class Array02 {
    public static void main(String[] args) {
        double[] prices = {12.5, 45.0, 23.5, 8.0, 11.0};
        double sum = 0, avg = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        avg = sum / prices.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
