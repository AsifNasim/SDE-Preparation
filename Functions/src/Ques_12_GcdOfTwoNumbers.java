import java.util.Scanner;

public class Ques_12_GcdOfTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println(gcd(num1, num2));
    }

    private static int gcd(int num1, int num2) {
        int minOfTwo = minimum(num1, num2);
        while (minOfTwo != 0){
            if(num1%minOfTwo == 0 && num2%minOfTwo == 0){
                return minOfTwo;
            }
            minOfTwo--;
        }
        return 0;
    }

    private static int minimum(int num1, int num2) {
        if(num1<=num2){
            return num1;
        }
        else{
            return  num2;
        }
    }
}
