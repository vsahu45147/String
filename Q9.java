import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request a sentence from the user
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Request two words from the user: one to search for and one to replace
        System.out.println("Enter the word to search for:");
        String searchWord = scanner.next();

        System.out.println("Enter the word to replace it with:");
        String replaceWord = scanner.next();

        // Find the first occurrence of the search word in the sentence
        int indexOfSearchWord = sentence.indexOf(searchWord);

        // If the search word is found, replace it using substring operations and concatenation
        if (indexOfSearchWord != -1) {
            // Create the modified sentence
            String modifiedSentence = sentence.substring(0, indexOfSearchWord) + replaceWord +
                    sentence.substring(indexOfSearchWord + searchWord.length());

            // Display the original and modified sentences
            System.out.println("\nOriginal sentence: " + sentence);
            System.out.println("Modified sentence: " + modifiedSentence);
        } else {
            // If the search word is not found, display a message
            System.out.println("\nThe word \"" + searchWord + "\" is not found in the sentence.");
        }

        scanner.close();
    }
}
