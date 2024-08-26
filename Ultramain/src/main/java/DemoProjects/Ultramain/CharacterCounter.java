package DemoProjects.Ultramain;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {
        String input = "Programming";

        // Count the occurrences of each character
        Map<Character, Integer> charCountMap = countCharacters(input);

        // Print the character counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Method to count characters in a string
    public static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }
}
