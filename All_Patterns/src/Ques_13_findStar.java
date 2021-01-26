import java.util.Scanner;
//   ****|**|***
public class Ques_13_findStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(findStar(s.next()));
    }

    private static int findStar(String str) {
        int count = 0;
        int start = 0;
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)=='|'){
                start = i;
                break;
            }
        }

        for (int i = start+1; i < str.length(); i++) {
            if(str.charAt(i)!= '|'){
                count++;
            }
        }

        return count-1;
    }
}
