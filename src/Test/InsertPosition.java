package Test;

public class InsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int result = searchInsert(nums, target);
        int result1 = getSearch(nums, target);
        System.out.println(result1);
    }

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        if (target>nums[end]){
            return nums.length;
        }

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end+1;
    }

    public static int getSearch(int[] nums, int target){
        int st=0;
        int end=nums.length-1;
        int ans=0;

        while(st<=end){
            int mid=(st+end)/2;
            if(target>nums[mid]){
                st=ans=mid+1;

            }
            else if(target<nums[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return ans;
    }
}
