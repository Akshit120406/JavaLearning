/*
Question 8: Discount Eligibility (OR Operator)
Task: Declare boolean isStudent = false; and boolean isSenior = true;. If the person is either a student OR a senior citizen, print "Eligible for discount". Otherwise, print "Standard price".

Expected Output:

Eligible for discount
*/
package Conditionals;
public class Conditionals08 {
    public static void main(String[] args) {
        boolean isStudent = false;
        boolean isSenior = true;

        if (isSenior || isStudent) {
            System.out.println(" Eligible for discount");
        } else {
            System.out.println("Not Eligible for discount");
        }
    }
}