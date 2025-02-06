package Random;

public class Leetcode121_Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] arr = {1,2};

        int mini = arr[0];
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, arr[i]);
        }
        System.out.println(profit);

//        int max = Integer.MIN_VALUE;
//        int profit = 0;
//
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                profit = arr[j] - arr[i];
//                if(profit > max){
//                    max = profit;
//                    System.out.println("profit = "+profit);
//                    System.out.println("arr[i] = "+arr[i]);
//                    System.out.println("arr[j] = "+arr[j]);
//                }
//            }
//        }
//        if(max > 0 ){
//            System.out.println(max);
//        }else{
//            System.out.println(0);
//        }
    }
}
