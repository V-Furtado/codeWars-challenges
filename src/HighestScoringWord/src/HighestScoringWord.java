/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * * * * * * * *  *
*  Given a string of words, you need to find the highest scoring word.										 *
*																											 *
*  Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.	 *
*																											 *
*  You need to return the highest scoring word as a string.													 *
*																											 *
*  If two words score the same, return the word that appears earliest in the original string.				 *
*																											 * 
*  All letters will be lowercase and all inputs will be valid.   										     *
*																										     *
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * * * * * * */


public class HighestScoringWord {
    public static String high(String s) {

        int maxValue = 0;
        String highestValueString = "";

        // split string into words
        String[] words = s.split(" ");

        // go through each word and check max values
        for (String word: words)
        {
            int tempValue = wordValue(word);
            // check if value is greater than the one already stored
            if (tempValue > maxValue) {
                maxValue = tempValue;
                highestValueString = word;
            }
        }

        return highestValueString;
    }
    // this method will calculate the value of a word
    // a = 1, b = 2, c = 3..
    private static int wordValue(String word) {
        //to-do
        int value = 0;
        for (char ch: word.toCharArray()){
            value += (int)ch - 96;
        }
        return value;
    }
}