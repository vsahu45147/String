import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Convert the string to a character array
        char[] charArray = inputString.toCharArray();

        // Prompt the user to enter a character to search
        System.out.println("Enter a character to search in the string:");
        char searchChar = scanner.next().charAt(0);

        // Find the first and last occurrences of the character
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == searchChar) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }

        // Display the character array and the positions found (if any)
        System.out.println("\nCharacter array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println("\n");

        if (firstOccurrence != -1 && lastOccurrence != -1) {
            System.out.println("First occurrence of '" + searchChar + "': " + firstOccurrence);
            System.out.println("Last occurrence of '" + searchChar + "': " + lastOccurrence);
        } else {
            System.out.println("The character '" + searchChar + "' is not found in the string.");
        }

        scanner.close();
    }
}
