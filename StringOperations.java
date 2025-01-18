import java.util.Scanner;

class StringOperations {

    public static void printAsciiValues(String s) {
        if (s.isEmpty()) {
            System.out.println("No characters to display ASCII values.");
            return;
        }
        
        System.out.println("ASCII Values:");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int asciiValue = (int) ch;
            System.out.println("Character: " + ch + " ASCII Value: " + asciiValue);
        }
    }

    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static String toUpperCase(String s) {
        return s.toUpperCase();
    }

    public static String removeSpaces(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static void printDigits(String s) {
        boolean foundDigit = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.print(ch);
                foundDigit = true;
            }
        }
        if (!foundDigit) {
            System.out.println("No digits found.");
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            printAsciiValues(input);

            String lowercaseString = toLowerCase(input);
            System.out.println("Lowercase: " + lowercaseString);

            String uppercaseString = toUpperCase(input);
            System.out.println("Uppercase: " + uppercaseString);

            String stringWithoutSpaces = removeSpaces(input);
            System.out.println("String without spaces: " + stringWithoutSpaces);

            printDigits(input);
        }
    }
}
