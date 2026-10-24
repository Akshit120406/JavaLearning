/*
Question 6: Grade Evaluator
Task: Declare int score = 88;. Print grades based on these ranges:

90 and above: "Grade A"

80 to 89: "Grade B"

70 to 79: "Grade C"

Below 70: "Grade F"

Expected Output:

Grade B
*/
package Conditionals;

public class Conditionals06 {
    public static void main(String[] args) {
        int score = 88;
        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }
    }
}
