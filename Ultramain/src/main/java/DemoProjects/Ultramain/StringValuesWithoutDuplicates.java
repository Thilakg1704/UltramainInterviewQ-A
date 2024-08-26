package DemoProjects.Ultramain;

import java.util.HashMap;

public class StringValuesWithoutDuplicates {
    public static void main(String[] args) {
        String input = "programming";

        // Count characters and remove duplicates
        String result = removeDuplicatesAndCount(input);
        System.out.println("Processed String: " + result);
    }

    // Method to count characters and remove duplicates
    public static String removeDuplicatesAndCount(String input) {
        // HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        StringBuilder result = new StringBuilder();

        // Iterate through the string
        for (char c : input.toCharArray()) {
            // Count the occurrences of each character
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);

            // If the character is not already in the result, add it
            if (charCountMap.get(c) == 1) {
                result.append(c);
            }
        }

        // Display character counts
        System.out.println("Character Counts: " + charCountMap);
        return result.toString();
    }
}

