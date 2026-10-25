/*
Question 5: Counting Digits of a NumberGoal: Given int num = 98765;, write a loop that counts how many total digits are in num.Hint: Integer division by 10 (num / 10) removes the last digit. Loop until num reaches 0.
Expected Output:
Total digits: 5
*/
package Loops;
public class Loops05 {
    public static void main(String[] args) {
        int num = 98765;
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
