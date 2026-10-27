/*
Question 9: Simple Prime CheckerGoal: Given int n = 29;, check whether n is a prime number (divisible only by 1 and itself). Print "29 is Prime" or "29 is Not Prime".Hint: Use a loop from 2 up to n - 1 to check if any number divides n evenly (n % i == 0).

Expected Output:
29 is Prime
*/
package Loops;
public class Loops09 {
    public static void main(String[] args) {
        int n = 29;
        for (int i = 2; i < 29; i++) {
            if (n % i == 0) {
                System.out.println(n + " is Not Prime");
                break;
            } else {
                System.out.println(n + " is Prime");
                break;
            }
        }
    }
}
