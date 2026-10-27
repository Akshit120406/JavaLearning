/*
Question 6: Reversing a NumberGoal: Given int original = 1234;, build a new integer variable reversed that contains the digits in reverse order (4321).Hint: Combine modulus % 10 (extract last digit) and division / 10 inside a while loop.

Expected Output:
Reversed Number: 4321
*/
package Loops;
public class Loops06 {
    public static void main(String[] args) {
        int original = 1234;
        int n = original;
        int rev = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        System.out.println("Reversed Number: " + rev);
    }
}
