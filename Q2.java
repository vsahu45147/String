public class Q2 {
    public static void main(String[] args) {
        // Demonstrating String immutability
        String originalString = "Hello";
        String modifiedString = originalString.concat(" World");

        // Original string remains unchanged
        System.out.println("Original String: " + originalString); // Output: Hello
        System.out.println("Modified String: " + modifiedString); // Output: Hello World

        // Demonstrating usage as CharSequence
        String str = "Java is awesome";

        // Using CharSequence methods
        System.out.println("Length of the string: " + str.length()); // Output: 14
        System.out.println("Character at index 2: " + str.charAt(2)); // Output: v

        // Subsequence
        CharSequence subSequence = str.subSequence(5, 7);
        System.out.println("Subsequence from index 5 to 7: " + subSequence); // Output: is

        // Demonstrating immutability through assignment
        CharSequence assignedSequence = str;
        // assignedSequence.append(" and powerful"); // This would result in compilation error as CharSequence doesn't have append method

        // Even though CharSequence interface doesn't have an append method,
        // we can still assign a String to it since String implements CharSequence.
        System.out.println("Assigned Sequence: " + assignedSequence); // Output: Java is awesome
    }
}
