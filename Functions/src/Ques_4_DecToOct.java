import java.util.Scanner;

public class Ques_4_DecToOct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(DecToOct(s.nextInt()));
    }

    private static int DecToOct(int input) {
        int oct = 0;
        int place = 1;
        while (input > 0){
            int lastDigit = input%8;
            oct = oct+lastDigit*place;
            place = place*10;
            input = input/8;
        }
        return oct;
    }
}
