package Test;

public class InfiniteArray {
    public static void main(String[] args) {

        int[] nums = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 1;
        System.out.println(prepareArray(nums,target));
    }

    private static int prepareArray(int[] nums,int target){

        //preparing the point of small chunks
        int start =0;
        int end = 1;

        //checking the conditions for my target for appropriate chunk
        while (target>nums[end]){
            //changing the start point
            int newStart = end+1;
            end = end + ((end-start+1)*2);//doubling up the size of the chunks & finding the index of the end
            start=newStart;
        }

        return binarySearch(nums,target,start,end);
    }

    public static int binarySearch(int[] nums, int target, int start, int end){
        while (start<=end){
            int mid = start+((end-start)/2);
            if (target>nums[mid]){
                start = mid+1;
            }else if (target<nums[mid]){
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
