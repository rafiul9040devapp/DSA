package Test;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {2,5,7,7,7,7,8,8};
        int target = 2;
        int[] result  = searchRange(nums,target);
        for (int i = 0; i < result.length ; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] searchRange(int[] nums, int target) {

        int[] result = {-1,-1};

        result[0] = getIndex(nums,target,true);
        if(result[0]!=-1){
            result[1] = getIndex(nums,target,false);
        }

        return result;
    }

    public static int getIndex(int[] nums,int target,boolean isFirstOccurred){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start+((end-start)/2);

            if (target>nums[mid]){
                start = mid+1;
            }else if (target < nums[mid]){
                end = mid-1;
            }else {
                ans = mid;
                if (isFirstOccurred){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
