import java.util.Scanner;

public class Ques_14_xPowerN {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int base = s.nextInt() , power = s.nextInt();

        System.out.println(sPowerN(base, power));
    }

    private static int sPowerN(int base, int power) {

        int num = 1;
        while ( power > 0){
            num = base * num;
            power--;
        }

        return num;
    }
}
