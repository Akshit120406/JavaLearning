/*
 Question 5: Floating Point Numbers
Task: Create a double variable named price set to 99.99 and an int variable named quantity set to 3. Calculate total cost (price * quantity) and print it.

Expected Output:

Total Cost: 299.97
 */
package Basics;
public class Basics05 {
    public static void main(String[] args) {
        double price = 99.99;
        int quantity = 3;
        System.out.println("Total Cost: " + String.format("%.2f", price * quantity));
    }
}
