import java.util.Scanner;

public class Ques_2 {
//    reverse of a number
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long num = s.nextLong();
    long reverse = 0;

    while (num != 0){
        long rem = num%10;
        reverse = reverse*10 + rem;
        num = num/10;
    }

    System.out.println(reverse);
}
}
