/*
Question 8: Finding First Multiple Above ThresholdGoal: Find the first number starting from 1 whose square (i * i) is strictly greater than 200. Stop the loop immediately once found using break and print the number.

Expected Output:
First number whose square exceeds 200: 15
*/
package Loops;
public class Loops08 {
    public static void main(String[] args) {
        int i = 1;
        while (i >= 1) {
            if ((i * i) > 200) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
