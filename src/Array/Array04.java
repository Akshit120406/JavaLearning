/* Question 4: Count Specific Conditions
Task: Given int[] scores = {45, 78, 90, 32, 65, 88, 50};, count how many students passed (score >= 50).

Expected Output:
Passed count: 5 */
package Array;
public class Array04 {
    public static void main(String[] args) {
        int[] scores = {45, 78, 90, 32, 65, 88, 50};
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 50) {
                count++;
            }
        }
        System.out.println("Passed Count: " + count);
    }
}
