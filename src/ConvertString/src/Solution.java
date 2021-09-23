/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * * * * * * * * *
 *  Complete the method/function so that it converts dash/underscore delimited words into camel casting.    *
 *  The first word within the output should be capitalized only if the original word was capitalized 		*
 *  (Known as Upper Camel Case, also often referred to as Pascal case)										*														        *
 *   								        																*
 *   Examples:																							    *
 *                                                                                                  		*
 *   "the-stealth-warrior" gets converted to "theStealthWarrior"                                            *
 *   																										*
 *   "The_Stealth_Warrior" gets converted to "TheStealthWarrior"                                            *                                                  *
 *                                                                                                          *
 *   																									    *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * * * * * */

import java.lang.StringBuilder;

public class Solution {
	static String toCamelCase(String s) {
		
		//Attributes 
		String camelCaseString;
		StringBuilder sb = new StringBuilder();
		
		// Separate each word delimited by a -_ into an array
		String[] wordList = s.split("[-_]");
		
		// Make all words uppercase, except for the first one
		for (int i = 0; i < wordList.length; i++) {
			if (i == 0) {
				// Add the first word
				sb.append(wordList[i]);
			}
			
			if (i >= 1) {
				// Check if it is an uppercase
				if (Character.isUpperCase(wordList[i].charAt(0))) {
					// add to sb if is already uppercase
					sb.append(wordList[i]);
				}
				// Check if it is a lowercase
				if (Character.isLowerCase(wordList[i].charAt(0))) {
					String tempString = wordList[i].substring(0,1).toUpperCase() + wordList[i].substring(1);
					// Append it
					sb.append(tempString);
				}
			}
		}
		
		// Return camelCaseString 
		camelCaseString = sb.toString();
		return camelCaseString;
	}

}
