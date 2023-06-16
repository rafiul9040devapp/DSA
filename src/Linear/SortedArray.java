package Linear;

import java.util.ArrayList;
import java.util.List;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,4,8};
//        boolean isSorted = getTheSorted(arr,0);
//        System.out.println("Is Sorted Array: "+ isSorted);
//        System.out.println(getTheSortedAlternate(arr));
//        boolean isTarget = getTHeTarget(arr,0,0);
//        System.out.println(isTarget);
        System.out.println(getTHeTargetIndexASE(arr,1,0) );
        System.out.println(getTHeTargetIndexDSE(arr,8,arr.length-1));

        int[] arr2 ={1,2,3,5,4,8,5,6};
        ArrayList<Integer> allTarget = new ArrayList<>();
        getTHeTargetIndexForAll(arr2,0,0,allTarget);
        System.out.println(allTarget);

        System.out.println(getTHeTargetIndexForAll(arr2,5,0));
    }

    private static boolean getTHeTarget(int[] arr, int target, int index) {
        if (index== arr.length){
            return false;
        }
        return arr[index]==target || getTHeTarget(arr,target,index+1);
    }
    private static int getTHeTargetIndexASE(int[] arr, int target, int startIndex) {
        if (startIndex== arr.length){
            return -1;
        }
        if (arr[startIndex]==target) return startIndex;
        return getTHeTargetIndexASE(arr,target,startIndex+1);
    }
    private static int getTHeTargetIndexDSE(int[] arr, int target, int lastIndex) {
        if (lastIndex== -1){
            return -1;
        }
        if (arr[lastIndex]==target) return lastIndex;
        return getTHeTargetIndexDSE(arr,target,lastIndex-1);
    }

    private static boolean getTheSorted(int[] arr, int startIndex) {
        if (startIndex== arr.length-1){
            return true;
        }
        return arr[startIndex] < arr[startIndex+1] && getTheSorted(arr,startIndex+1);

    }
    private static boolean getTheSortedAlternate(int[] arr) {
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;

    }
    public static ArrayList<Integer> getTHeTargetIndexForAll(int[] arr, int target, int index, ArrayList<Integer> allTarget) {
        if (index== arr.length){
            return allTarget;
        }
        if (arr[index]==target){
            allTarget.add(index);
        }
       return getTHeTargetIndexForAll(arr,target,index+1,allTarget);
    }
    public static ArrayList<Integer> getTHeTargetIndexForAll(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index== arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
       ArrayList<Integer> ansFromBelow =  getTHeTargetIndexForAll(arr,target,index+1);

        list.addAll(ansFromBelow);
        return list;
    }
}
