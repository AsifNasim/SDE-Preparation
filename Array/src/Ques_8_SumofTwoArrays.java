import java.util.ArrayList;
import java.util.Scanner;


public class Ques_8_SumofTwoArrays {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size_1 = s.nextInt();
        int [] arr1 = new int[size_1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }

        int size_2 = s.nextInt();
        int [] arr2 = new int[size_2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = s.nextInt();
        }

        ArrayList ans = sumOfTwoArrays(arr1, arr2);
        System.out.println(ans);
    }

    private static ArrayList sumOfTwoArrays(int[] arr1, int[] arr2) {

        ArrayList list = new ArrayList();
        int ArrInt = 0;
        for (int i = arr1.length-1; i >= 0 ; i--) {
            ArrInt = ArrInt*10 + arr1[i];
        }

        int ans = revNum(ArrInt);
        int ArrInt2 = 0;
        for (int i = arr2.length-1; i >= 0 ; i--) {
            ArrInt2 = ArrInt2*10 + arr2[i];
        }

        int ans2 = revNum(ArrInt2);
        int sum = ans+ ans2;

        int maxSize = 0;
        if(arr1.length > arr2.length){
            maxSize = arr1.length;
        }
        else{
            maxSize = arr2.length;
        }

        while (maxSize != 0){
            list.add(maxSize-1, sum%10);
            sum = sum/10;
        }

        return list;

    }

    private static int revNum(int input) {
        int ans = 0;
        while (input != 0){
            int last = input%10;
            ans = ans*10+ last;
            input= input/10;
        }
        return ans;

    }



}
