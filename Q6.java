import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input two strings
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // Convert both strings to lowercase and uppercase
        String firstLower = firstString.toLowerCase();
        String firstUpper = firstString.toUpperCase();

        String secondLower = secondString.toLowerCase();
        String secondUpper = secondString.toUpperCase();

        // Compare the converted strings to check case-insensitive equality
        boolean isEqualIgnoreCase = firstLower.equals(secondLower);

        // Display the converted strings and the result of the comparison
        System.out.println("\nConverted strings:");
        System.out.println("First string (lowercase): " + firstLower);
        System.out.println("First string (uppercase): " + firstUpper);
        System.out.println("Second string (lowercase): " + secondLower);
        System.out.println("Second string (uppercase): " + secondUpper);
        System.out.println("\nCase-insensitive equality check result: " + isEqualIgnoreCase);

        scanner.close();
    }
}
