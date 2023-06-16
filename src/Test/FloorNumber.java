package Test;

public class FloorNumber {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18};
        int[] nums2 = {2,7,11,15};
        int target = 9;
        int indexResult = getFloorValue(nums2,target);
       if (indexResult==-1){
           System.out.println("Invalid Number");
       }else {
           System.out.println(nums2[indexResult]);
       }
    }

    private static int getFloorValue(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start+ ((end-start)/2);

            if (target>nums[mid]){
                start = mid+1;
            }else if (target<nums[mid]){
                end = mid-1;
            }else {
                return mid;
            }
        }
        return end;
    }
}
