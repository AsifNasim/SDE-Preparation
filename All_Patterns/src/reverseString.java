import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        String res = "";


        for (int i = 0; i < str.length()-1; i++) {
            int wordEnd = 0;
            if(str.charAt(i) == ' '){
                res += str.substring(i-1,wordEnd);
            }
            wordEnd = i+1;
        }

        return res;
    }
}
