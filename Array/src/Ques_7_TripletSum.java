import java.util.Scanner;

public class Ques_7_TripletSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        tripletSum(arr, target);
    }

    private static void tripletSum(int[] arr, int target) {
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j <arr.length-1 ; j++) {
                for (int k = j+1; k <arr.length ; k++) {
                    if(arr[i]+arr[j]+arr[k] == target){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }

}
