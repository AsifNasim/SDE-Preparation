import java.util.Scanner;

//Merging two sorted array
public class Ques_4_MergeSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
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

        int [] ans = mergeSort(arr1,arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] mergeSort(int[] arr1, int[] arr2) {
        int i =0, j =0, k = 0;

        int [] ans = new int[arr1.length+ arr2.length];
        while (i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                i++;
                k++;
            }
            else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while ((i< arr1.length)){
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while ((j<arr2.length)){
            ans[k] = arr2[j];
            j++;
            k++;
        }

        return ans;
    }
}
