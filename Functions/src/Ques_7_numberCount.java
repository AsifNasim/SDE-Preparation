import java.util.Scanner;

public class Ques_7_numberCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int digit = s.nextInt();
        System.out.println(countDigit(num,digit));

    }

    private static int countDigit(int num, int digit) {
        int count= 0;
        while (num > 0){
            int last = num%10;
            if (last == digit){
                count++;
            }
            num /= 10;
        }
        return count;
    }
}

