/*
Question 3: Multiplication Table with a TwistGoal: Print the multiplication table for 7 from 1 to 10. However, skip printing the result if the multiple is an even number (use the continue keyword).

Expected Output:
7 x 1 = 7
7 x 3 = 21
7 x 5 = 35
7 x 7 = 49
7 x 9 = 63
*/
package Loops;
public class Loops03 {
    public static void main(String[] args) {
        int table = 7;
        for (int i = 1; i <= 10; i++) {
            int res = table * i;
            if (res % 2 == 0) {
                continue;
            }
            System.out.println(table + " x " + i + " = " + res);
        }
    }
}
