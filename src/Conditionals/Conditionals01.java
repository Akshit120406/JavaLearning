/*
Question 1: Simple Pass/Fail
Task: Declare int marks = 65;. If marks is greater than or equal to 50, print "Pass". Otherwise, print "Fail".

Expected Output:

Plaintext
Pass
*/
package Conditionals;
public class Conditionals01 {
    public static void main(String[] args) {
        int marks = 65;
        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
