import java.util.Scanner;

public class Ques_11_numDiamondPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int row = 1;
        int val = 0;
        int k = 1;
        while ( k<= input){
            int space = 1;
            while (space < input - row){
                System.out.print(" "+" ");
                space++;
            }

            int col = 1;
            while (col <= (2*row) -1){
                if(col > row){
                    --val;
                    System.out.print(val+" ");
                }
                else{
                    ++val;
                    System.out.print(val+" ");
                }
                col++;
            }

            if (k < input/2 +1){
                row = row+1;
            }
            else {
                row = row -1;
            }
            System.out.println();
            k++;
            val= row-1;
        }
    }
}
