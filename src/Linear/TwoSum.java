package Linear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {

        int[] numbers = {3, 3};
        int[] nums1 = {4, 9,5};
        int[] nums2 = {4,9,8,9,8};
        int target = 6;
        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));

        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        //arrays are sorted in the ASC order
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> resultList = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            //in the sorted array binary search is used in the both of the array
            if (nums1[i] == nums2[j]) {
                //common values are added the list
                //then indexes are incremented
                resultList.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                //num1 is bigger we need to increment num2 in order to get the bigger value
                j++;
            } else {
                //num2 is bigger we need to increment num1 in order to get the bigger value
                i++;
            }
        }

        //converting the List into Array
        int[] result = new int[resultList.size()];
        int index = 0;
        for (int num: resultList) {
            result[index] = num;
           index++;
        }

        return result;
    }
}
