import java.util.Scanner;

public class Ques_13LCMoFTwoNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        System.out.println(LCM(num1,num2));
    }

    private static int LCM(int num1, int num2) {
        int lcm = 0;
        int maxnumber = maxNum(num1, num2);
        int num = 1;
        int lcmNum = 1;
        while (num <= Integer.MAX_VALUE){
            lcmNum = maxnumber*num;
            if((lcmNum%num1) == 0 && (lcmNum%num2) == 0){
                 lcm = lcmNum;
                 break;
            }
            num++;
        }
        return lcm;
    }

    private static int maxNum(int num1, int num2) {
        if(num1 >= num2){
            return  num1;
        }
        else{
            return  num2;
        }
    }
}
