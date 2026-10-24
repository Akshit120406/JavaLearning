/*
Question 2: Positive, Negative, or Zero
Task: Declare int num = -8;. Check if the number is positive, negative, or zero using if, else if, and else.

Expected Output:

Number is negative
*/
package Conditionals;
public class Conditionals02 {
    public static void main(String[] args) {
        int num = -8;
        if (num < 0) {
            System.out.println("Number is Negative");
        } else if (num == 0) {
            System.out.println("Number is Zero");
        } else {
            System.out.println("Number is Positive");
        }
    }
}
