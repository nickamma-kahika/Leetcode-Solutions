package Random;

public class Leetcode3105_Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray {
    public static void main(String[] args) {
        int[] nums = {1,4,3,3,2};
        int inc=1;
        int dec=1;
        int maxLen=1;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){

            if(nums[i]==prev){
                inc=1;
                dec=1;
            }else if(nums[i]>prev){
                //increasing
                inc++;
                dec=1;
            }else{
                //decreasing
                dec++;
                inc=1;
            }
            prev=nums[i];
            int maxItem=Math.max(inc,dec);
            maxLen=Math.max(maxLen,maxItem);

        }
        System.out.println(maxLen);

    }
}
