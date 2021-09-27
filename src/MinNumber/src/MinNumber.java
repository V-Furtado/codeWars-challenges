
/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * * * * * * * * *
 *  Given an array of integers your solution should find the smallest integer.                              *
 *                                                                                                          *
 *   Eample:                                                                                                *
 *   input array: [34, 15, 88, 2]  |   [34, -345, -1, 100]                                                  *
 *   output: 2    |   -345                                                                                  *
 *                                                                                                          *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * * * * * */

public class MinNumber {
	public static int findSmallestInt(int[] args) {
		if (args == null || args.length == 0) {
			throw new IllegalArgumentException("args must be non-null with length > 0");  
		}
		// variable
		int minNum = args[0];
		
		// compute the minimum  element 
		for (int index: args) {
			if (index < minNum) {
				minNum = index;
			}
		}
		return minNum;
	}

}
