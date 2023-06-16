package Linear;

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] ans = getConcatinated(nums);
        int[] ans2 = getConcatinatedAlternate(nums);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans2));
    }

    private static int[] getConcatinated(int[] nums) {
        int[] result = new int[nums.length*2];

        for (int i = 0; i < result.length ; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if (i==j){
                    result[i] = nums[j];
                }if (i== j+ nums.length){
                    result[i] = nums[j];
                }
            }
        }
        return result;
    }
    private static int[] getConcatinatedAlternate(int[] nums) {
        int[] result = new int[nums.length*2];

        for (int i = 0; i < nums.length ; i++) {
           result [i] = result[i+ nums.length] = nums[i];
        }
        return result;
    }
}
