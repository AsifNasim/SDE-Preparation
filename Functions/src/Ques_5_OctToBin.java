import java.util.Scanner;

public class Ques_5_OctToBin {
//    we first convert to oct to dec and then dec to binary
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int dec =(OctToDec(s.nextInt()));
    System.out.println(dec);
    System.out.println(DecToBin(dec));
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

    private static int DecToBin(int input) {
        int bin = 0;
        int place = 1;
        while (input > 0){
            int lastDigit = input%2;
            bin = bin + lastDigit*place;
            input = input/2;
            place = place*10;
        }
        return bin;
    }
}
