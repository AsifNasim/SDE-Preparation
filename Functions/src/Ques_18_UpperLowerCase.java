import java.util.Scanner;

public class Ques_18_UpperLowerCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char input = s.next().charAt(0);
        if ((int)input >= 65 && (int)(input) <= 90){
            System.out.println("U");
        }

        if ((int)input >= 97 && (int)(input) <= 122){
            System.out.println("L");
        }

        else {
            System.out.println("I");
        }

    }
}
