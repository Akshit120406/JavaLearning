/*
Question 3: Even or Odd
Task: Declare int number = 14;. Use the modulus operator % to check if the number is even or odd.

Expected Output:

14 is Even
*/
package Conditionals;
public class Conditionals03 {
    public static void main(String[] args) {
        int number = 14;
        if (number % 2 != 0) {
            System.out.println(number + " is Odd");
        } else {
            System.out.println(number + " is Even");
        }
    }
}
