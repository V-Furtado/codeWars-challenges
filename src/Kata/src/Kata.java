/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * * * * * * * * *
 *  Complete the function to find the count of the most frequent item of an array.                          *
 *  You can assume that input is an array of integers. For an empty array return 0                          *
 *                                                                                                          *
 *   Example 1:                                                                                             *
 *   input array: [3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3]                                              *
 *   output: 5                                                                                              *
 *                                                                                                          *
 *   The most frequent number in the array is -1 and it occurs 5 times.                                     *
 *   																									    *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * * * * * */

public class Kata {
	public static int mostFrequentItemCount(int[] collection) {
		// attributes
		int currentDigit = 0;
		int count;
		int highestCount = 0;

		// create a Nested for loop to find the item with the highest count
		for (int i = 0; i < collection.length; i++) {
			currentDigit = collection[i];
			count = 0;

			// the second for loop
			for (int j = 0; j < collection.length; j++) {
				// if match item
				if (currentDigit == collection[j]) {
					count++;
					if (count > highestCount) {
						highestCount = count;
					}
				}
			}
		}
		return highestCount;
	}
}