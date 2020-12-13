import java.util.Scanner;

public class Ques_16_3Nplus_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N1 = s.nextInt(), N2 = s.nextInt();
        threeNPlus_two(N1, N2);
    }

    private static void threeNPlus_two(int n1, int n2) {
        int count = 1;
        while ( count <= n1){
            if((3*count + 2)%n2 != 0){
                System.out.print((3*count + 2)+" ");
            }
            count++;
        }
    }
}
