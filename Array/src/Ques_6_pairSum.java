import java.util.Scanner;

public class Ques_6_pairSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        pairSum(arr, target);
    }

    private static void pairSum(int[] arr, int target) {
        for (int i = 0; i < arr.length-1; i++) {
            int j = 0;
            while ( j < arr.length){
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i]+" "+arr[j]);
                    arr[i] = Integer.MIN_VALUE;
                }
                j++;
            }
        }
    }
}
