import java.util.Scanner;

public class Ques_3 {
//    diamond Pattern
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int input = s.nextInt();
    int k = 1;
    int row =1;
    while (k <= input){
        int space = 1;
        while (space <= input - row){
            System.out.print(" "+ " ");
            space++;
        }

        int col =1;
        while (col <= (2*row) - 1){
            System.out.print("*"+" ");
            col++;
        }
        if(k >= (input/2) + 1){
            row = row -1;
        }
        else{
            row = row +1;
        }
        System.out.println();
        k= k+1;
    }

}
}
