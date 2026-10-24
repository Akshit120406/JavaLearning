/*
Question 4: Voting Eligibility
Task: Declare int age = 17; and boolean isCitizen = true;. Check if the person is eligible to vote (must be at least 18 years old AND a citizen). Print "Eligible to vote" or "Not eligible to vote".

Expected Output:

Not eligible to vote
*/
package Conditionals;
public class Conditionals04 {
    public static void main(String[] args) {
        int age = 17;
        boolean isCitizen = true;
        if (age >= 18 && isCitizen == true) {
            System.out.println(" Eligible to Vote");
        } else {
            System.out.println(" Not Eligible to vote");
        }
    }
}
