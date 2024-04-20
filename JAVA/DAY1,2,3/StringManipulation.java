/* Task 9: String Operations
Write a method that takes two strings, concatenates them, reverses the result, and then extracts the middle substring of the given length. Ensure your method handles edge cases, such as an empty string or a substring length larger than the concatenated
 string.*/

package assignment;

public class StringManipulation {
    public static String extractMiddleSubstring(String str1, String str2, int length) {
        // Concatenate the two strings
        String concatenatedString = str1.concat(str2);

        // Reverse the concatenated string
        String reversedString = new StringBuilder(concatenatedString).reverse().toString();

        // Calculate the length of the reversed string
        int reversedLength = reversedString.length();

        // Check for edge cases
        if (reversedLength == 0 || length > reversedLength) {
            return ""; // Return an empty string if the length is larger than the reversed string or if the reversed string is empty
        } else if (length == reversedLength) {
            return reversedString; // Return the reversed string if the length is equal to the reversed string length
        }

        // Calculate the start index for the middle substring
        int startIndex = (reversedLength - length) / 2;

        // Extract the middle substring of the specified length
        String middleSubstring = reversedString.substring(startIndex, startIndex + length);

        return middleSubstring;
    }

    public static void main(String[] args) {
        // Test cases
        String str1 = "Hello";
        String str2 = "World";
        int length = 5;

        // Call the method and print the result
        String result = extractMiddleSubstring(str1, str2, length);
        System.out.println("Middle substring of length " + length + ": " + result);
    }
}



/* */
