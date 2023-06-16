package Recursion;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
//        System.out.println(removeElement(nums, val));
        System.out.println(removeElementAlternate(nums,val));

    }

    public static int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != val) {
                list.add(nums[index]);
            }
        }
        System.out.println(list);
        return list.size();
    }

    public static int removeElementAlternate(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != val) nums[j++] = nums[i];
        return j;
    }
}
