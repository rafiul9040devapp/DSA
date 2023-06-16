package Linear;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int[] result = getBubbleSorted(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getBubbleSorted(int[] nums) {

        //outer loops runs for the number of steps
        //and will run <=arr.length-1 times

        for (int steps = 0; steps <= nums.length-1 ; steps++) {

            for (int j = 1; j <= nums.length-(steps+1) ; j++) {
                //int the inner loops the array is going to be checked
                //it will check arr.length-(steps+1)

                if (nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }
}
