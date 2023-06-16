package EasyProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceOfArr {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(findDifference(nums1,nums2).toString());

    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2){
        //HashSet is used in order to find out the distinct value
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1){
            set1.add(i);
        }
        for (int j : nums2){
            set2.add(j);
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        //new list is added in the list for the creating to result list

        for (int i:set1) {
            if (!set2.contains(i)) { //value is checked
                result.get(0).add(i);
            }
        }
        for (int i:set2) {
            if (!set1.contains(i)) { //value is checked
                result.get(1).add(i);
            }
        }

        return result;
    }
}
