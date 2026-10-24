/*
Question 10: Range Checker
Task: Declare int val = 35;. Check if val falls strictly between 10 and 50 (inclusive). Print "In range" if it does, otherwise "Out of range".

Expected Output:

In range
*/
package Conditionals;
public class Conditionals10 {
    public static void main(String[] args) {
        int val = 65;
        if (val >= 10 && val <= 50) {
            System.out.println("In range");
        } else {
            System.out.println("Out of Range");
        }
    }
}