import java.util.Scanner;

public class Ques_15_LogXn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(), n = s.nextInt();
        System.out.println(logXn(x,n));
    }

    private static int logXn(int x, int n) {
      if(x == 0 && n == 0){
          return -1;
      }

      if(x == 1 && n == 1){
          return 0;
      }

      if(x == n){
          return 1;
      }

      if(n%x == 0){
          int count = 0;
          while (n > 1){
              n = n/x;
              count++;
          }
          return count;
      }
        return 0;
    }
}
