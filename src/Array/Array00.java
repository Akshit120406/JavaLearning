/*
Practice Set 4: Array Operations & Logic
These questions require manipulating array indices, tracking maximums/minimums, and building algorithms over collections.

Question 1: Element Access & Modification
Task: Declare an array int[] nums = {10, 20, 30, 40, 50};. Change the element at index 2 to 99. Print the entire array elements on a single line separated by spaces using a loop.

Expected Output:
10 20 99 40 50

Question 2: Sum & Average of Array Elements
Task: Given double[] prices = {12.5, 45.0, 23.5, 8.0, 11.0};, compute the sum and average of all prices.

Expected Output:
Sum: 100.0
Average: 20.0

Question 3: Finding the Maximum Element
Task: Given int[] arr = {14, 52, 88, 31, 9, 74};, write a loop to find and print the largest number in the array.

Hint: Assume int max = arr[0]; initially, then loop from index 1 to compare and update max.

Expected Output:
Maximum value: 88

Question 4: Count Specific Conditions
Task: Given int[] scores = {45, 78, 90, 32, 65, 88, 50};, count how many students passed (score >= 50).

Expected Output:
Passed count: 5

Question 5: Linear Search
Task: Given int[] data = {4, 8, 15, 16, 23, 42}; and int target = 16;, search for target. Print its index if found ("Found at index: 3"). If not found after searching the entire array, print "Not found".

Expected Output:
Found at index: 3

Question 6: Reversing an Array
Task: Given int[] original = {1, 2, 3, 4, 5};, create a new array int[] reversed of the same size and copy elements into it in reverse order. Print the reversed array elements.

Expected Output:
5 4 3 2 1

Question 7: Check if Array is Sorted
Task: Given int[] numbers = {3, 7, 12, 19, 25};, check whether the array is sorted in ascending order. Print "Array is sorted" or "Array is not sorted".

Hint: Loop from index 0 to length - 2 and check if numbers[i] > numbers[i + 1].

Expected Output:
Array is sorted

Question 8: Count Occurrence of an Element
Task: Given int[] values = {2, 5, 2, 8, 2, 9, 1}; and int key = 2;, count how many times key appears in values.

Expected Output:
Key 2 appears 3 times

Question 9: Finding the Second Largest Element
Task: Given int[] arr = {12, 35, 1, 10, 34, 1};, find the second largest distinct number in the array.

Hint: Track two variables: largest and secondLargest.

Expected Output:
Second Largest: 34

Question 10: Array Element Shift (Left Shift)
Task: Given int[] arr = {10, 20, 30, 40, 50};, shift all elements to the left by 1 position. The first element (10) should move to the end of the array. Print the updated array.

Expected Output:
20 30 40 50 10
*/