package Q3;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] letterCounts = new int[26]; // Array to hold counts of each letter
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a single word (letters only, please): ");
        String inputWord = scanner.nextLine().toUpperCase(); // Convert input to uppercase for uniformity

        try {
            StringBuilder invalidChars = new StringBuilder();
            for (char character : inputWord.toCharArray()) {
                if (Character.isLetter(character)) {
                    letterCounts[character - 'A']++; // Increment count for the letter
                } else {
                    invalidChars.append(character).append(" ");
                }
            }
            if (invalidChars.length() > 0) {
                throw new IllegalArgumentException(
                        "\nInvalid characters detected: " + invalidChars.toString().trim() + "\n");

            }

            // Display the frequency of each letter
            System.out.println("\nLetter frequencies:" + "\n");
            for (int i = 0; i < letterCounts.length; i++) {
                if (letterCounts[i] > 0) {
                    System.out.printf("%c: %d%n", 'A' + i, letterCounts[i]);

                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}