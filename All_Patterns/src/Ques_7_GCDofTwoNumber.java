import java.util.Scanner;

public class Ques_7_GCDofTwoNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int minNum = minOfTwo(num1, num2);
        while (minNum > 0){
            if((num1%minNum==0) && (num2%minNum==0)){
                System.out.println(minNum);
                break;
            }
            minNum--;
        }
    }

    private static int minOfTwo(int num1, int num2) {
        if(num1 < num2){
            return num1;
        }
        else{
            return  num2;
        }
    }
}
