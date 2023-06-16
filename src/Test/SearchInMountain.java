package Test;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,3,1};
        int target = 5;

        System.out.println(getTarget(nums,target));
    }

    public static int getTarget(int[] nums,int target){
        int peakIndex = getPeakInMountain(nums);
        int firstSearch = orderAgonisedBS(nums,target,0,peakIndex);
        if (firstSearch!=-1){
            return firstSearch;
        }
        return orderAgonisedBS(nums,target,peakIndex,nums.length-1);
    }

    public static int getPeakInMountain(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while (start<end){
            int mid = start+((end-start)/2);
            if (nums[mid]>nums[mid+1]){
                end= mid;
            }else {
                start = mid+1;
            }
        }
        return start;
    }

    public static int orderAgonisedBS(int[] nums,int target,int start, int end){
        boolean isASE = nums[start]<nums[end];

        while (start<=end){
            int mid = start+((end-start)/2);
//            if (target>nums[mid]){
//                if (isASE){
//                    start = mid+1;
//                }else {
//                    end = mid-1;
//                }
//            }else if (target<nums[mid]){
//                if (isASE){
//                    end = mid-1;
//                }else {
//                    start=mid+1;
//                }
//            }else {
//                return mid;
//            }
            if (target==nums[mid]){
                return mid;
            }else if (isASE){
                if (target>nums[mid]){
                    start = mid+1;
                }else {
                    end= mid-1;
                }
            }else {
                if (target>nums[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
