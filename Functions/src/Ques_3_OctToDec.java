import java.util.Scanner;

public class Ques_3_OctToDec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(OctToDec(s.nextInt()));
    }

    private static int OctToDec(int input) {
        int dec = 0;
        int place = 1;
        while (input > 0){
            int lastDigit = input%10;
            dec = dec+lastDigit*place;
            place = place*8;
            input = input/10;
        }
        return dec;
    }

}
