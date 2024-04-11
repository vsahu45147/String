import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two strings from the user
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // Concatenate the strings using the concat() method and the + operator
        String concatResultMethod = firstString.concat(secondString);
        String concatResultOperator = firstString + secondString;

        // Display both concatenation results
        System.out.println("\nConcatenation using concat() method: " + concatResultMethod);
        System.out.println("Concatenation using + operator: " + concatResultOperator);

        // Ask the user for an index number
        System.out.println("\nEnter an index number to retrieve a character:");
        int index = scanner.nextInt();

        // Display the character at the specified index
        if (index >= 0 && index < concatResultMethod.length()) {
            char charAtIndex = concatResultMethod.charAt(index);
            System.out.println("Character at index " + index + ": " + charAtIndex);
        } else {
            System.out.println("Invalid index! The index should be within the range of the concatenated string.");
        }

        scanner.close();
    }
}
