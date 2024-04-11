import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        boolean continueExploring = true;

        while (continueExploring) {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Convert to lowercase");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Search for a character");
            System.out.println("4. Search for an index");
            System.out.println("5. Concatenate with another string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Convert to lowercase
                    String lowercaseString = inputString.toLowerCase();
                    System.out.println("String in lowercase: " + lowercaseString);
                    break;
                case 2:
                    // Convert to uppercase
                    String uppercaseString = inputString.toUpperCase();
                    System.out.println("String in uppercase: " + uppercaseString);
                    break;
                case 3:
                    // Search for a character
                    System.out.print("Enter a character to search for: ");
                    char searchChar = scanner.nextLine().charAt(0);
                    int charIndex = inputString.indexOf(searchChar);
                    if (charIndex != -1) {
                        System.out.println("Character '" + searchChar + "' found at index: " + charIndex);
                    } else {
                        System.out.println("Character '" + searchChar + "' not found in the string.");
                    }
                    break;
                case 4:
                    // Search for an index
                    System.out.print("Enter an index to search for: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < inputString.length()) {
                        char charAtIndex = inputString.charAt(index);
                        System.out.println("Character at index " + index + ": " + charAtIndex);
                    } else {
                        System.out.println("Invalid index! The index should be within the range of the string.");
                    }
                    break;
                case 5:
                    // Concatenate with another string
                    System.out.print("Enter another string to concatenate: ");
                    String appendString = scanner.nextLine();
                    String concatenatedString = inputString.concat(appendString);
                    System.out.println("Concatenated string: " + concatenatedString);
                    break;
                case 6:
                    // Exit
                    continueExploring = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }

        scanner.close();
    }
}
