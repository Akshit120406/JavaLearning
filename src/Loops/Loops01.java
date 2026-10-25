/*
Question 1: Countdown TrackerGoal: Print a countdown starting from 10 down to 1. Once it reaches 0, print "Liftoff!".Constraint: Use a while loop.

Expected Output:
10
9
...
1
Liftoff!
*/
package Loops;
public class Loops01 {
    public static void main(String[] args) {
        int i = 10;
        while (i >= 0) {
            if (i == 0) {
                System.out.println("Liftoff!");
                break;
            }
            System.out.println(i);
            i--;
        }
    }
}
