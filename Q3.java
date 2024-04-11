import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        StringBuffer textBuffer = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        boolean keepEditing = true;

        while (keepEditing) {
            System.out.println("\nMenu:");
            System.out.println("1. Append text");
            System.out.println("2. Insert text");
            System.out.println("3. Delete text");
            System.out.println("4. Reverse text");
            System.out.println("5. Replace text");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    String textToAppend = scanner.nextLine();
                    textBuffer.append(textToAppend);
                    break;
                case 2:
                    System.out.print("Enter index to insert at: ");
                    int insertIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter text to insert: ");
                    String textToInsert = scanner.nextLine();
                    textBuffer.insert(insertIndex, textToInsert);
                    break;
                case 3:
                    System.out.print("Enter start index to delete: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter end index to delete: ");
                    int endIndex = scanner.nextInt();
                    textBuffer.delete(startIndex, endIndex);
                    break;
                case 4:
                    textBuffer.reverse();
                    break;
                case 5:
                    System.out.print("Enter start index to replace: ");
                    int replaceStartIndex = scanner.nextInt();
                    System.out.print("Enter end index to replace: ");
                    int replaceEndIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter text to replace with: ");
                    String replacementText = scanner.nextLine();
                    textBuffer.replace(replaceStartIndex, replaceEndIndex, replacementText);
                    break;
                case 6:
                    keepEditing = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("\nCurrent text: " + textBuffer);
            System.out.println("Current capacity: " + textBuffer.capacity());
            System.out.println("Current length: " + textBuffer.length());
        }

        scanner.close();
    }
}
