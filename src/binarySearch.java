import java.sql.SQLOutput;

public class binarySearch {
    public static void main(String[] args){

        int[] arr = new int[]{-1, 0, 3, 5, 9, 12, 15, 23, 43, 81};
        int target = 43;

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start - (start-end)/2;
            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }else{
                System.out.println(mid);
                break;
            }
        }
    }
}
