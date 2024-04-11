import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a base string
        System.out.println("Enter the base string:");
        String baseString = scanner.nextLine();

        // Prompt the user to enter the number of concatenations
        System.out.println("Enter the number of concatenations:");
        int numConcatenations = scanner.nextInt();

        // Using StringBuilder
        System.out.println("\nUsing StringBuilder...");
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder(baseString);
        for (int i = 1; i < numConcatenations; i++) {
            stringBuilder.append(baseString);
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        long elapsedTimeStringBuilder = endTimeStringBuilder - startTimeStringBuilder;
        System.out.println("Time taken: " + elapsedTimeStringBuilder + " milliseconds");
        System.out.println("Final string length: " + stringBuilder.length());

        // Using StringBuffer
        System.out.println("\nUsing StringBuffer...");
        long startTimeStringBuffer = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer(baseString);
        for (int i = 1; i < numConcatenations; i++) {
            stringBuffer.append(baseString);
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        long elapsedTimeStringBuffer = endTimeStringBuffer - startTimeStringBuffer;
        System.out.println("Time taken: " + elapsedTimeStringBuffer + " milliseconds");
        System.out.println("Final string length: " + stringBuffer.length());

        // Comparison
        long timeDifference = Math.abs(elapsedTimeStringBuilder - elapsedTimeStringBuffer);
        String faster = (elapsedTimeStringBuilder < elapsedTimeStringBuffer) ? "StringBuilder" : "StringBuffer";
        System.out.println("\nComparison: " + faster + " was faster than the other by " + timeDifference + " milliseconds.");

        scanner.close();
    }
}
