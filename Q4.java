import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String initialString = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(initialString);

        boolean continueEditing = true;

        while (continueEditing) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a substring at a specified position");
            System.out.println("2. Remove a range of characters");
            System.out.println("3. Modify a character at a specified index");
            System.out.println("4. Concatenate another string at the end");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the substring to add: ");
                    String substringToAdd = scanner.nextLine();
                    System.out.print("Enter the position to add at: ");
                    int positionToAdd = scanner.nextInt();
                    stringBuilder.insert(positionToAdd, substringToAdd);
                    break;
                case 2:
                    System.out.print("Enter the start index of the range to remove: ");
                    int startIndexToRemove = scanner.nextInt();
                    System.out.print("Enter the end index of the range to remove: ");
                    int endIndexToRemove = scanner.nextInt();
                    stringBuilder.delete(startIndexToRemove, endIndexToRemove);
                    break;
                case 3:
                    System.out.print("Enter the index of the character to modify: ");
                    int indexToModify = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter the new character: ");
                    char newChar = scanner.nextLine().charAt(0);
                    stringBuilder.setCharAt(indexToModify, newChar);
                    break;
                case 4:
                    System.out.print("Enter the string to concatenate: ");
                    String stringToConcatenate = scanner.nextLine();
                    stringBuilder.append(stringToConcatenate);
                    break;
                case 5:
                    continueEditing = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                    break;
            }

            System.out.println("Modified String: " + stringBuilder.toString());
        }

        scanner.close();
    }
}
