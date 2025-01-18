import java.util.Scanner;

public class StringUtilities {

    public static String reverseString(String s) {
        int l = s.length();
        String r = ""; 
        for (int i = l - 1; i >= 0; i--) {
            r += s.charAt(i);  
        }
        return r;  
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }

    public static void printOnlyDigits(String input) {
        System.out.print("Only Digits: ");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.print(ch);
            }
        }
        System.out.println();
    }

    public static String onlyChars(String input) {
        String alphabets = ""; 
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabets += ch;  
            }
        }
        return alphabets; 
    }

    public static String reverseCase(String input) {
        StringBuilder result = new StringBuilder();  
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));  
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));  
            } else {
                result.append(ch); 
            }
        }
        return result.toString();  
    }

    public static String shiftByTwo(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            result.append((char) (currentChar + 2));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String input = sc.nextLine();
        
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
        
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        printOnlyDigits(input);
        
        String alphabets = onlyChars(input);
        System.out.println("Only Alphabets: " + alphabets);
        
        String reversedCase = reverseCase(input);
        System.out.println("String with reversed case: " + reversedCase);
        
        String shiftedString = shiftByTwo(input);
        System.out.println("String shifted by two positions: " + shiftedString);
        
        sc.close();  
    }
}
