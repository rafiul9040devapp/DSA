package Test;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18};
        int target = 17;
        int indexResult = getCeilingValue(nums,target);

        if (indexResult == -1){
            System.out.println("Invalid");
        }else {
            System.out.println(nums[indexResult]);
        }
    }

    private static int getCeilingValue(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        if (target>nums[end]){
            return -1;
        }

        while (start<=end){
            int mid = start +((end-start)/2);

            if (target>nums[mid]){
                start = mid+1;
            }else if (target<nums[mid]){
                end = mid-1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
