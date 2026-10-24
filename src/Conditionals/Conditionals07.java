/*
Question 7: Leap Year Checker (Basic)
Task: Declare int year = 2024;. A year is a leap year if it is divisible by 4 (year % 4 == 0). Check if 2024 is a leap year and print the result.

Expected Output:

2024 is a Leap Year
*/
package Conditionals;
public class Conditionals07 {
    public static void main(String[] args) {
        int year = 2024;

        if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
