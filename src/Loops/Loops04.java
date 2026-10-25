/*
Question 4: Factorial CalculatorGoal: Calculate the factorial of n = 5 ($5! = 5 \times 4 \times 3 \times 2 \times 1$).Constraint: Store the result in a variable and print the final value.

Expected Output:
Factorial of 5 is 120
*/
package Loops;
public class Loops04 {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("Factorial of 5 is " + fact);
    }
}
