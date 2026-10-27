/*
Question 10: Printing Patterns (Nested Loops)Goal: Write a nested for loop (a loop inside a loop) to print a right-angled triangle pattern of asterisks (*) with 5 rows.Hint: Outer loop controls the row number (i), inner loop controls how many stars (j) to print on that row (j <= i).

Expected Output:
*
**
***
****
*****
*/
package Loops;
public class Loops10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
