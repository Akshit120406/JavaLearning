/*
Question 5: Finding the Maximum of Two Numbers
Task: Declare int num1 = 45; and int num2 = 72;. Compare them and print which one is larger.

Expected Output:

72 is larger
*/
package Conditionals;
public class Conditionals05 {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 72;
        if (num1 > num2) {
            System.out.println(num1 + " is larger");
        } else {
            System.out.println(num2 + " is larger");
        }
    }
}
