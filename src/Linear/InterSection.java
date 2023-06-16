package Linear;

import java.util.*;

public class InterSection {
    public static void main(String[] args) {

        int[] nums1={2,2};
        int[] nums2={1,2,2,1};

        //int[] result = intersection(nums1,nums2);
        int[] result2 = intersection(nums1,nums2);
       // System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length>nums2.length){
            return findInterSection(nums2,nums1);
        }else{
            return findInterSection(nums1,nums2);
        }
    }
    public static int[] intersectionBest(int[] nums1, int[] nums2) {
       HashSet<Integer> setNums1 = new HashSet<>();
       HashSet<Integer> setNums2 = new HashSet<>();
       HashSet<Integer> setResult = new HashSet<>();

        for (int i:nums1) {
            setNums1.add(i);
        }
        for (int i:nums2) {
            setNums2.add(i);
        }
        for (int element:setNums1) {
            if (setNums2.contains(element)){
                setResult.add(element);
            }
        }
        int[] result = new int[setResult.size()];
        int index = 0;

        for (int element:setResult) {
            result[index] = element;
            index++;
        }
        return result;
    }

    public static int[] findInterSection(int[] nums1, int[]nums){
        //List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> result = new HashMap<>();

        for (int i = 0; i <nums1.length ; i++) {
                for (int elements : nums) {
                    if (nums1[i] == elements) {
                        result.put(i,nums1[i]);
                        break;
                    }
            }
        }
        //System.out.println(result);

        int[] value = new int[result.size()];
        int index= 0 ;
        for (int i: result.values()) {
            value[index] = i;
            index++;
        }

        return value;
    }
    public static int[] findInterSection2(int[] nums1, int[]nums){

        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i <nums1.length ; i++) {
                for (int elements : nums) {
                    if (nums1[i] == elements) {
                        result.add(nums1[i]);
                    }
            }
        }

        int[] value = new int[result.size()];
        int index= 0 ;
        for (int i: result) {
            value[index] = i;
            index++;
        }

        return value;
    }
}
