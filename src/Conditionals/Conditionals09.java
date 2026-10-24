/*
Question 9: Nested If Statements
Task: Declare int age = 22; and boolean hasLicense = false;.

First check if age >= 18.

If true, check inside if hasLicense is true. If yes, print "Can drive". If no, print "Cannot drive without a license".

If age < 18, print "Too young to drive".

Expected Output:

Cannot drive without a license
*/
package Conditionals;
public class Conditionals09 {
    public static void main(String[] args) {
        int age = 22;
        boolean hasLicense = false;
        if (age >= 18) {
            if (hasLicense) {
                System.out.println("Can Drive");
            } else {
                System.out.println("Cannot drive without a license");
            }
        } else {
            System.out.println("Too young to drive");
        }
    }
}