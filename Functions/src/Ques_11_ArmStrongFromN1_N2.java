import java.util.Scanner;

public class Ques_11_ArmStrongFromN1_N2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        isArmStrongBtwnN1andN2(num1,num2);
    }

    private static void isArmStrongBtwnN1andN2(int num1, int num2) {
        while (num1 <= num2){
            isArmStrong(num1);
            num1++;
        }
    }

    private static void isArmStrong(int num) {
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
            System.out.print(armNumber+" ");
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
