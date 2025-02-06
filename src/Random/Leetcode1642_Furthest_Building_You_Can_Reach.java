package Random;

public class Leetcode1642_Furthest_Building_You_Can_Reach {
    public static void main(String[] args) {
        int[] heights = {4,2,7,6,9,14,12};
        int bricks = 5;
        int ladders = 1;
        int n = heights.length;
        int ans = 0;

        for(int i=0; i<n-1; i++){
            if(heights[i+1] > heights[i]){
                if(heights[i+1]-heights[i] <= bricks){
                    bricks = bricks - (heights[i+1]-heights[i]);
                    ans = i;
                    System.out.println(i+" this is I in if block and bricks is  -> "+bricks);
                }else if(ladders > 0){
                    ladders -= 1;
                    ans = i;
                    System.out.println(i+" this is I in else if block and bricks are -> "+bricks);
                }else{
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
