import java.util.Scanner;

public class Ques_1_DecToBin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long input = s.nextLong();
        System.out.println(DecToBin(input));

    }

    private static long DecToBin(long input) {
        long bin = 0;
        long place = 1;
        while (input > 0){
            long lastDigit = input%2;
            bin = bin + lastDigit*place;
            input = input/2;
            place = place*10;
        }
        return bin;
    }
}
