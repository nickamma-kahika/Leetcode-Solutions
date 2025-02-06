package Random;

import java.util.ArrayList;
import java.util.List;

public class Leetcode54_Spiral_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int n = arr.length; // no. of rows
        int m = arr[0].length; // no. of columns

        // Initialize the pointers required for traversal.
        int top = 0, left = 0, bottom = n - 1, right = m - 1;
        List<Integer> list = new ArrayList<>();

        while(top<=bottom && left<=right) {
            for (int i = left; i <= right; i++)
                list.add(arr[top][i]);

            top++;

            // For moving top to bottom.
            for (int i = top; i <= bottom; i++)
                list.add(arr[i][right]);

            right--;

            // For moving right to left.
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    list.add(arr[bottom][i]);

                bottom--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    list.add(arr[i][left]);

                left++;
            }
        }
        System.out.println(list);
    }
}
