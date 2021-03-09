import java.util.Arrays;
import java.util.Scanner;

public class Ques_12_MergeWithExtraSpace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size1= s.nextInt();
        int [] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = s.nextInt();
        }
        int size2= s.nextInt();
        int [] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = s.nextInt();
        }

        mergeWithoutExtraSpace(arr1, arr2);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }

    private static void mergeWithoutExtraSpace(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[0]){
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }
            Arrays.sort(arr2);
        }
    }
}
