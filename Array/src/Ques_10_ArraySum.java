import java.util.Scanner;

public class Ques_10_ArraySum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        int [] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]  = s.nextInt();
        }

        int size2 = s.nextInt();
        int [] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = s.nextInt();
        }
        int [] ans = sumOfTwoArrays(arr1, arr2);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] sumOfTwoArrays(int[] arr1, int[] arr2) {
        int size = Math.max(arr1.length, arr2.length);
        int [] sum = new int[size];
        int l1 = arr1.length-1;
        int l2 = arr2.length-1;
        int l3 = sum.length-1;
        int carry = 0;

        while (l3 >= 0){
            if(l1 >= 0 && l2 >= 0){
                sum[l3] = carry + arr1[l1] + arr2[l2];
                if ( sum[l3] > 9){
                    carry = 1;
                    sum[l3] %= 10;
                }
                else{
                    carry = 0;
                }
                l3--;
                l2--;
                l1--;
            }

            else if(l1 < 0 && l2 >= 0){
                sum[l3] = carry + arr2[l2];
                if ( sum[l3] > 9){
                    carry = 1;
                    sum[l3] %= 10;
                }
                else{
                    carry = 0;
                }
                l3--;
                l2--;
            }

            else if(l1 >= 0 && l2 < 0){
                sum[l3] = carry + arr1[l1] ;
                if ( sum[l3] > 9){
                    carry = 1;
                    sum[l3] %= 10;
                }
                else{
                    carry = 0;
                }
                l3--;
                l1--;
            }
            else {
                sum[l3] = carry;
                l3--;
            }
        }
        return sum;

    }
}
