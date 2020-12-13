import java.util.Scanner;

public class Ques_9_MirrorInverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(mirrorInverse(s.nextInt()));
    }

    private static boolean mirrorInverse(int num) {
        int digit = 1;
        int inverse = 0;
        while (num != 0){
            int last = num%10;
            inverse += digit*(int)Math.pow(10,(last-1));
            num = num/10;
            digit++;
        }
        if (num==inverse){
            return true;
        }
        else{
            return false;
        }
    }
}
