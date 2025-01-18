import java.util.Scanner;

public class CountNewString {
    public static boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return c=='a' || c=='e' || c=='i' || c== 'o' || c=='u';
    }
    public static int countVowel(String s){
        int count=0;
        for(char curr : s.toCharArray()){
            if(isVowel(curr)){
                count++;
            }
        }
        return count;
    }
    public static String onlyDigits(String s){
        String result="";
        for(char curr : s.toCharArray()){
            if(Character.isDigit(curr)){
                result+=curr;
            }
        }
        return result;
    }
    public static String onlyChars(String s){
        String result="";
        for(char curr : s.toCharArray()){
            if(Character.isLetter(curr)){
                result+=curr;
            }
        }
        return result;
    }
    public static String reverseCase(String s){
        StringBuilder toggle =new StringBuilder();
        for(char curr : s.toCharArray()){
            if(Character.isUpperCase(curr)){
                toggle.append(Character.toLowerCase(curr));
            } else if (Character.isLowerCase(curr)) {
                toggle.append(Character.toUpperCase(curr));
            }else{
                toggle.append(curr);
            }
        }
        return toggle.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println("No.ofVowels: "+countVowel(s));
        System.out.println("Only characters: "+onlyChars(s));
        System.out.println("Only digits: "+onlyDigits(s));
        System.out.println("Toggled case : "+reverseCase(s));
    }
}
