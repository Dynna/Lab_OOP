package lab_3;
import java.util.Arrays;

import static lab_3.Text.*;

public class Main {
    public static void main (String[] args) {
        String description = "For shy who thoroughly her boy estimating conviction. Removed demands do shy expense account in " +
                "outward tedious do. Particular way thoroughly unaffected projection favourable mrs can projecting own." +
                "Thirty shy it matter enable become admire in giving. See resolved shy enable goodness felicity shy civility domestic" +
                "had but. Drawings do offended yet answered enable jennings perceive laughing six shy did far.";

        System.out.println("The number of sentences in the text is: " + getNumberOfSentences(description));
        System.out.println("The number of words in the text is: " + getNumberOfWords(description));
        System.out.println("The number of letters in the text is: " + getNumberOfLetters(description));
        System.out.println("The number of vowels in the text is: " + getNumberOfVowels(description));
        System.out.println("The number of consonants in the text: " + getNumberOfConsonants(description));
        System.out.println("The longest word from this text: " + findTheLongestWord(description));
        findTopFiveWords(description);
    }
}
