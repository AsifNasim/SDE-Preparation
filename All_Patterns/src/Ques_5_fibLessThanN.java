import java.util.Scanner;

public class Ques_5_fibLessThanN {
//    all fibonacci less than n
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long input = s.nextLong();
    long f1 = 0;
    long f2 = 1;
    long f3 = 0;
    int i = 0;
    while (i < input){
        f3 = f1 + f2;
        f1 = f2;
        f2 = f3;
        System.out.print(f1+" ");
        i++;
    }
}
}
