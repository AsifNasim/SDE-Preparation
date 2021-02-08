import java.util.Scanner;

public class Ques_9_MinimizeTheHeights {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        int ans = minimizeTheHeights(arr, k);
        System.out.println(ans);
    }

    private static int minimizeTheHeights(int[] arr, int k) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-k <= 0 ){
                arr[i] += k;
            }
            else if(arr[i]+k <= 0 ){
                arr[i] += k;
            }
            else if(arr[i]-k > 0 ){
                arr[i] -= k;
            }

            if(arr[i] < smallest){
                smallest = arr[i];
            }

            if(arr[i] > largest){
                largest = arr[i];
            }

        }

        return  largest-smallest;
    }

}
