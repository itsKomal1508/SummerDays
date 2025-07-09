public class MoveSpeacialCharToLast {

    // Method to move special characters to the end of the string
    public static String moveSpecialCharacters(String str) {
        StringBuilder lettersAndDigits = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is letter or digit
            if (Character.isLetterOrDigit(ch)) {
                lettersAndDigits.append(ch);
            } else {
                specialChars.append(ch);
            }
        }

        // Combine normal and special characters
        return lettersAndDigits.toString() + specialChars.toString();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Test input
        String input = "He@llo!12#";

        // Calling method and storing result
        String result = moveSpecialCharacters(input);

        // Output the result
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result);
    }
}
