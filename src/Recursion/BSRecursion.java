package Recursion;

public class BSRecursion {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,9,10,15,19};
        int target = 20;
       // System.out.println(binarySearch(arr,target,0,arr.length-1));
        System.out.println(binarySearchAlternate(arr,target,0,arr.length-1));
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + ((end - start) / 2);
        if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, end);
        } else if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }
        return mid;
    }


    public static int binarySearchAlternate(int[] arr, int target, int start ,int end){
        //initial condition where call is going to break
        if (start>end){
            return -1;
        }

        int mid = start + ((end-start)/2);
        //recursion call for the rest of the conditions
        if (target > arr[mid]){
           return binarySearch(arr,target,mid+1,end);
        }else if (target<arr[mid]){
           return binarySearch(arr,target,start,mid-1);
        }
        return mid;
    }
}
