package lab_3;
import java.util.HashMap;
import java.util.Map;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import java.util.*;
class Text {

    static int getNumberOfSentences(String string) {
        return string.split("[!?.:]+").length;
    }

    static int getNumberOfWords(String string) {
        return string.split("\\s+").length;
    }

    static int getNumberOfLetters(String string) {
        int count = 0;
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)))
                count++;
        }
        return count;
    }

    static int getNumberOfVowels(String string) {
        int count = 0;
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'
                    || string.charAt(i) == 'o' || string.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }

    static int getNumberOfConsonants(String string) {
        int count = 0;
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++)
        {
            if ((string.charAt(i) >= 'a' && string.charAt(i)<='z') &&(string.charAt(i) != 'a' && string.charAt(i) != 'e'
                    && string.charAt(i) != 'i' && string.charAt(i) != 'o' && string.charAt(i) != 'u'))
            {
                count++;
            }
        }

        return count;
    }

    static String findTheLongestWord(String string) {
        int max = 0;
        String longestWord = "";
        String[] wordList = string.split("\\s+");
        for (String s : wordList) {
            if (s.length() > max) {
                max = s.length();
                longestWord = s;
            }
        }

        return longestWord;
    }

    static String[] findTopFiveWords(String string) {
        String[] wordList = string.split("\\s+");
        String[] topFive = new String[5];
        HashMap<String, Integer> topWords = new HashMap<String, Integer>();
        for (String s : wordList) {
            topWords.merge(s, 1, Integer::sum);
        }
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(topWords.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return a.getValue().compareTo(b.getValue());
            }
        });
        System.out.println("Top five words: ");
        for(int i = 0; i < 5; i++){
            System.out.println(entries.get(entries.size() - i - 1).getKey() + " - " + entries.get(entries.size() - i - 1).getValue());
            topFive[i] = entries.get(entries.size() - i - 1).getKey();
        }
        return topFive;
    }
}
