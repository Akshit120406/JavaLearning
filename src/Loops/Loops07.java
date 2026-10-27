/*
Question 7: Sum of Even and Odd Numbers SeparatelyGoal: Loop through numbers from 1 to 20. Maintain two separate sum variables: one for even numbers and one for odd numbers. Print both sums after the loop ends.

Expected Output:
Sum of Evens: 110
Sum of Odds: 100
*/
package Loops;
public class Loops07 {
    public static void main(String[] args) {
        int even = 0, odd = 0;
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
            i++;
        }
        System.out.println("Sum of Evens " + even);
        System.out.println("Sum of Odds " + odd);
    }
}
