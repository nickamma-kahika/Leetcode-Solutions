package GeeksForGeeks;

public class Floor_in_a_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {10143,29122,30010};
        int k = 23112;
        int low = 0, high = arr.length-1;

        int ans = -1;

        while(low<=high){
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                ans = mid;// Exact match found
                break;
            } else if (arr[mid] < k) {
                ans = mid;     // Potential floor found
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        System.out.println(ans);
    }
}
