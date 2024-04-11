public class Q1 {
    public static void main(String[] args) {
        // Using String literals
        String str1 = "hello";
        String str2 = "hello";
        
        // Using 'new' keyword
        String str3 = new String("hello");
        String str4 = new String("hello");

        // Comparing string literals
        System.out.println("Comparing string literals:");
        System.out.println("str1 == str2 : " + (str1 == str2)); // true
        System.out.println("str1.equals(str2) : " + str1.equals(str2)); // true
        
        // Comparing strings created using 'new' keyword
        System.out.println("\nComparing strings created using 'new' keyword:");
        System.out.println("str3 == str4 : " + (str3 == str4)); // false (different memory locations)
        System.out.println("str3.equals(str4) : " + str3.equals(str4)); // true
        
        // Comparing string literal with string created using 'new' keyword
        System.out.println("\nComparing string literal with string created using 'new' keyword:");
        System.out.println("str1 == str3 : " + (str1 == str3)); // false (different memory locations)
        System.out.println("str1.equals(str3) : " + str1.equals(str3)); // true
    }
}
