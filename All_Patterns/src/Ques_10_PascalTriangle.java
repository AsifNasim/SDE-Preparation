import java.util.Scanner;

public class Ques_10_PascalTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int row = 0;
        while (row < input){
            int col = 0;
            int r = 0;
            while (col <= row){
                System.out.print(nCr(row,r));
                r++;
                col++;
            }
            System.out.println();
            row++;
        }
    }

    private static int nCr(int row, int r) {
        int num = fact(row);
        int deno = fact(row-r) * fact(r);
        return num/deno;
    }

    private static int fact(int row) {
        int i = 1;
        int facto = 1;
        while (i <= row){
            facto = facto*i;
            i++;
        }
        return facto;
    }
}
