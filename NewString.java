import java.util.Scanner;
class NewString
{
    static String deleteword(String str,String wordtobedeleted)
    {
        String array[]=str.split(" ");
        String c="";;
        for(int i=0;i<array.length;i++)
        {
            if(!(array[i].equals(wordtobedeleted)))
            {
                c+=array[i]+" ";;
            }
        }
        return c;
    }
      static String upper(String str)
      {
          return str.toUpperCase();
      }
    public static String is_editable(String str){
        // String vowel = "aeiou";
        String first = "";
        String second = "";
        int j =0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(i==0 && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
            {
                return str.concat("way");
            }
            else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                j=i;
                break;
            }
            else{
                first += ch;
            }
        }
        for (int k = j; k < str.length(); k++) {
            char ch = str.charAt(k);
            second += ch;
        }
        second = second+first;
        return second.concat("ay");
    }
    public static String swapWords(String sentence, int idx1, int idx2) {
        String[] words = sentence.split("\\s+");

        if (idx1 >= 1 && idx1 <= words.length && idx2 >= 1 && idx2 <= words.length) {
            String temp = words[idx1 - 1];
            words[idx1 - 1] = words[idx2 - 1];
            words[idx2 - 1] = temp;
        } else {
            return "Invalid indices. No changes made.";
        }

        return String.join(" ", words);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(upper(str));;
        String b=s.nextLine();
        String updated=deleteword(str,b);;
        System.out.println(updated);;
        System.out.println(is_editable(str));;
        int indx1,indx2;
        indx1=s.nextInt();
        indx2=s.nextInt();
        String swaped=swapWords(str,indx1,indx2);
        System.out.println(swaped);;
    }

}
