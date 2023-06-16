package Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTheIndex {
    public static void main(String[] args) {
        int[] num = {3,0,1};
        System.out.println( missingNumber(num));
        System.out.println(missingNumberAlternate(num));

       // int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {-3,-1,0,0,0,3,3};

        System.out.println(removeDuplicates(nums));
    }

    public static int missingNumber(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for (int i: nums) {
            numsSet.add(i);
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int i = 0; i <=nums.length ; i++) {
            resultSet.add(i);
        }

        for (int i : resultSet) {
            if (!numsSet.contains(i)) return i;
        }

        return -1;
    }
    public static int missingNumberAlternate(int[] nums) {
       //Binary Search
        Arrays.sort(nums);
        int start = 0;
        int end =  nums.length;
        while (start<end){
            int mid = start + ((end-start)/2);
            if (mid >= nums[mid]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return start;
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for (int i: nums) {
            result.add(i);
        }
        System.out.println( result.toString());

        int index = 0;
        for (int j :result) {
            nums[index++] = j;
        }

        System.out.println(Arrays.toString(nums));
        return result.size();

    }
}
