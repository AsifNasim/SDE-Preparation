import java.util.Scanner;

public class Ques_6_allPrimeTillN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int primeNum = 2;
        while (primeNum <= input){
            boolean isPrime = true;
            int divisor = 2;
            while (divisor < primeNum){
                if (primeNum%divisor == 0){
                    isPrime = false;
                    break;
                }
                divisor++;
            }
            if (isPrime){
                System.out.print(primeNum+" ");
            }
            primeNum++;
        }
    }
}
