package Test;

public class MountainArray {
    public static void main(String[] args) {
        int[] mountain = {0,1,0};
        int[] mountain2 = {0,2,1,0};
        int[] mountain3 = {1,2,1,3,5,6,4};
        int index;
        System.out.println(index= getPeakInMountain(mountain));
        System.out.println(index= getPeakInMountain(mountain2));
        System.out.println(mountain3[getPeakInMountain(mountain3)]);
    }

    private static int getPeakInMountain(int[] nums) {
        int start= 0;
        int end = nums.length-1;
        while (start<end){
            int mid = start+((end-start)/2);
            if (nums[mid]>nums[mid+1]){
                //already in DSE order
                //mid is also a potential answer
                //and so end = mid
                end=mid;
            }else { //mountain[mid]<mountain[mid-1]
                //already in ASE order
                //so just using the traditional process
                start = mid+1;
            }
        }
        return start; // start == end both are accepted as answer
    }
}
