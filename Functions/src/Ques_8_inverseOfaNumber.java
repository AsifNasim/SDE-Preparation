import java.util.Scanner;

public class Ques_8_inverseOfaNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(NumberInverse(num));
    }

    private static int NumberInverse(int num) {
        int digit = 1;
        int inverse = 0;
        while (num != 0){
            int last = num%10;
            inverse += digit*(int)Math.pow(10,(last-1));
            num = num/10;
            digit++;
        }
        return inverse;
    }
}
