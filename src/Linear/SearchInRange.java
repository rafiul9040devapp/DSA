package Linear;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums= {18,12,-7,3,14,28};
        int target = 18;
        System.out.println(linearSearchInRange(nums,target,1,4));
        System.out.println(min(nums));
        System.out.println(max(nums));
    }

    public static int linearSearchInRange(int[] nums, int target, int start,int end){
        if (nums.length==0){
            return -1;
        }

        for (int index = start; index <=end ; index++) {
            if (target==nums[index]){
                return index;
            }
        }
        return -1;
    }

    public static int min(int[] nums){
        int min = nums[0];

        if (nums.length==1){
            return min;
        }
        for (int index = 1; index <nums.length ; index++) {
            if (nums[index]<min){
                min = nums[index];
            }
        }
        return min;
    }
    public static int max(int[] nums){
        int max = nums[0];
        for (int element:nums) {
            if (element>max){
                max= element;
            }
        }
        return max;
    }
}
