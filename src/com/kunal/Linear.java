package com.kunal;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {12,8,14,16,48,20,45,55,-11} ;
        int target = 20;

        int result = getLinearSearch2(arr,target);
        System.out.println(result);

        System.out.println(getLinearSearch3(arr,target));

//        for (int j:arr) {
//            if (j==14){
//                System.out.println(j);
//            }
//        }

    }

    static int getLinearSearch(int[] arr, int target){
        if (arr.length ==0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int elements = arr[index];
            if (elements == target){
                return index;
            }
        }
        //target is not found in that case it will execute
        return -1;
    }

    static int getLinearSearch2(int[] arr, int target){
        if (arr.length ==0){
            return Integer.MAX_VALUE;
        }

        for (int elements: arr) {
            if (elements == target) {
                return elements;
            }
        }
        //target is not found in that case it will execute
        return Integer.MAX_VALUE;
    }

    static boolean getLinearSearch3(int[] arr, int target){
        if (arr.length ==0){
            return false;
        }

        for (int elements:arr) {
            if (elements == target) {
                return true;
            }
        }
        //target is not found in that case it will execute
        return false;
    }
}
