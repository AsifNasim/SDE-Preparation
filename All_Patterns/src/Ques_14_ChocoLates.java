import java.util.*;

class ChocoLates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int chocolates[] = new int[n];
            for (int i = 0; i < n; i++) {
                chocolates[i] = sc.nextInt();
            }
            boolean res = dividingChocolate(n, chocolates);
            if (res)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    static boolean dividingChocolate(int n, int[] chocolates) {
        int countOne = 0;
        int countTwo = 0;
        for(int i =0 ; i< n; i++){
            if(chocolates[i] == 100){
                countOne++;
            }
            else{
                countTwo++;
            }
        }
        if(countOne==countTwo){
            return true;
        }
        else if(countOne == 0 && countTwo%2==0){
            return true;
        }
        else if(countTwo == 0 && countOne%2==0){
            return true;
        }
        return false;
    }
}