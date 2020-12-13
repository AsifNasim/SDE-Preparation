import java.util.Scanner;

public class Ques_17_SquareRootPrecisionP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();

        int i =1;
        while (i*i <= n){
            if ( i*i == n ){
                System.out.printf("%.2f", i);
            }
            i = i+1;
        }
    }
}
