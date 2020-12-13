import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ques_5_ArrayIntersection {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int [] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = s.nextInt();
        }
        ArrayList ans = arrayIntersection(arr,arr2);
        Collections.sort(ans);
        System.out.println(ans);
    }

    private static ArrayList arrayIntersection(int[] arr, int[] arr2) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]){
                    list.add(arr[i]);
                    arr2[j] =Integer.MIN_VALUE;
                    break;
                }
            }
        }
        return (list);
    }
}
