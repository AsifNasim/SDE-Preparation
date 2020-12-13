import java.util.Scanner;

public class Ques_2_BinToDec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(binToDec(s.nextInt()));
    }

    private static int binToDec(int input) {
        int dec = 0;
        int place = 1;
        while (input > 0){
            int lastDigit = input%10;
            dec = dec+lastDigit*place;
            place = place*2;
            input = input/10;
        }
        return dec;
    }
}
