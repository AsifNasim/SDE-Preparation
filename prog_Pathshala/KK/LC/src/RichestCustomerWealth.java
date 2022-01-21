import java.util.ArrayList;

public class RichestCustomerWealth {
//    https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args) {

        int [][] accounts = {{1,2,3},{3,2,1}};

        System.out.println(maximumWealth(accounts));

    }

     static int maximumWealth(int[][] accounts) {
         ArrayList<Integer> list = new ArrayList<>();
         for (int row = 0; row < accounts.length; row++) {
             int sum = 0;
             for (int col = 0; col < accounts[row].length; col++) {
                 sum += accounts[row][col];
             }
             list.add(sum);
         }

         int MaxWealth = Integer.MIN_VALUE;

         for (int i = 0; i < list.size(); i++) {

             if(list.get(i) > MaxWealth){
                 MaxWealth = list.get(i);

             }
         }
         return MaxWealth;
    }
}
