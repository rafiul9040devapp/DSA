package Test;

import java.util.Arrays;

public class SumTwoNumber {
    public static void main(String[] args) {
//        int[] numbers={2,3,4};
//        int target = 6;
//        int[] numbers={2,7,11,15};
//        int target = 9;
//        int[] numbers={-1,0};
//        int target = -1;
        int[] numbers = {3,2,4};
        int target = 6;
        int[] result=twoSum(numbers,target);
        int[] result2=twoSumAlternate(numbers,target);
        int[] result3=twoSumAlternate2(numbers,target);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
    public static int[] twoSum(int[] numbers, int target) {

        int[] result = {-1,-1};

        result[0] = floorValueSearch(numbers,target);
        if (result[0]!=-1){
            int newTarget = target - numbers[result[0]];
            result[1] = binarySearch(numbers,newTarget);

            if (numbers[result[0]]>numbers[result[1]]){
                result[0]+=1;
                result[1]+=1;
                int temp = 0;
                temp = result[0];
                result[0] = result[1];
                result[1] = temp;
            }else {
                result[0]+=1;
                result[1]+=1;
            }
        }
        return result;
    }
    public static int binarySearch(int[] numbers, int target){
        int start = 0;
        int end = numbers.length-1;
        boolean isASE = numbers[0]<numbers[end];

        while (start<=end){
            int mid = start+((end-start)/2);
            if (target>numbers[mid]){
                if (isASE){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }else if (target<numbers[mid]){
                if (isASE){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static int floorValueSearch(int[] numbers, int target){
        int start = 0;
        int end = numbers.length-1;

        while (start<=end){
            int mid = start+((end-start)/2);
            if (target>numbers[mid]){
                start = mid+1;
            }else if (target<numbers[mid]){
                end =end-1;
            }else {
                return mid;
            }
        }
        return end;
    }

    public static int[] twoSumAlternate(int[] numbers, int target) {
        int start = 0 ;
        int end = numbers.length-1;

        while (start<=end){
            int sum = numbers[start]+numbers[end];
            if (target==sum){
                return new int[]{start+1,end+1};
            }else if (target>sum){
               start++;
            }else{ //target<sum
                end--;
            }
        }
        return new int[] {-1,-1};
    }
    public static int[] twoSumAlternate2(int[] numbers, int target) {
        int start = 0 ;
        int end = numbers.length-1;

        while (start<=end){
            int sum = numbers[start]+numbers[end];
            if (target==sum){
                return new int[]{start,end};
            }else if (target>sum){
               start++;
            }else{ //target<sum
                end--;
            }
        }
        return new int[] {-1,-1};
    }

}
