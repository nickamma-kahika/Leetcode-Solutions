package Random;

import java.util.Arrays;

public class Leetcode73_Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] arr = {{1, 0}};

        int[] arrm = new int[arr[0].length];
        Arrays.fill(arrm, -1);
        int[] arrn = new int[arr.length];
        Arrays.fill(arrn, -1);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    arrn[i] = 0;
                    arrm[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arrn));
        System.out.println(Arrays.toString(arrm));

        for (int i = 0; i < arrm.length; i++) {
            if (arrm[i] == 0) {
                putCol(i, arr);
            }
        }
        for (int i = 0; i < arrn.length; i++) {
            System.out.println(arrn[i] + " if running");
            if (arrn[i] == 0) {
                putRow(i, arr);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    static void putCol(int i, int[][] arr) {
        for (int j = 0; j < arr.length; j++) {
            arr[j][i] = 0;
        }
    }

    static void putRow(int i, int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            System.out.println(arr[i][j] + " pre change");
            arr[i][j] = 0;
            System.out.println(arr[i][j] + " post change");
        }
    }
}

//    static void markCol(int j, int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i][j] != 0) {
//                arr[i][j] = -1;
//            }else{
//                arr[i][j] = 0;
//            }
//        }
//    }
//
//    static void markRow(int i, int[][] arr) {
//        for (int j = 0; j < arr[0].length ; j++) {
//            if(arr[i][j] != 0) {
//                arr[i][j] = -1;
//            }else{
//                arr[i][j] = 0;
//            }
//        }
//    }


//BRUTE FORCE
//for (int i = 0; i < arr.length ; i++) {
//        for (int j = 0; j < arr[0].length ; j++) {
//        if(arr[i][j] == 0){
//markRow(i, arr);
//markCol(j, arr);
//                }
//                        }
//                        }
//                        for (int i = 0; i < arr.length; i++) {
//        System.out.println(Arrays.toString(arr[i]));
//        }
//
//        for (int i = 0; i < arr.length ; i++) {
//        for (int j = 0; j < arr[0].length ; j++) {
//        if(arr[i][j] == -1){
//arr[i][j] = 0;
//        }
//        }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//        System.out.println(Arrays.toString(arr[i]));
//        }
