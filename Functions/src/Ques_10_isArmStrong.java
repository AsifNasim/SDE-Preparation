import java.util.Scanner;

public class Ques_10_isArmStrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(isArmStrong(num));
    }

    private static boolean isArmStrong(int num) {
        int armNumber = num;
        int ans = 0;
        int powerCount = count(num);
        while ( num > 0){
            int last = num%10;
            int result = finalResult(last, powerCount);
            ans = ans + result;
            num = num/10;
        }
        if(armNumber == ans){
            return true;
        }
        else{
            return false;
        }
    }

    private static int finalResult(int lastNum, int powerCount) {
        int ans = 1;
        int result = lastNum;
        while (powerCount > 0){
            ans = ans*result;
            powerCount--;
        }
        return ans;
    }

    private static int count(int num) {
        int count = 0;
        while (num > 0){
            int last = num%10;
            count++;
            num = num/10;
        }
        return count;
    }
}
