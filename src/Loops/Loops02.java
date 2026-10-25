/*
Question 2: Accumulator Pattern (Sum of Numbers)Goal: Calculate the sum of all integers from 1 to 100 inclusive using a for loop. Print only the final result.

Expected Output:
Sum from 1 to 100: 5050
*/
package Loops;
public class Loops02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 ro 100: " + sum);
    }
}
