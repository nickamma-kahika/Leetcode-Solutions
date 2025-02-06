package Hard_Array.Incomplete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode118_Pascals_Triangle {
    public static void main(String[] args) {

        // we have to claculate nCr for first type of problem
        // In which we have to find the element present in
        // certain row and certain column
        long res = nCr(3,1);
        System.out.println(res);


    }

    static long nCr(int n, int r){
        long res = 1;
        for(int i=0;i<r;i++) {
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }
}
