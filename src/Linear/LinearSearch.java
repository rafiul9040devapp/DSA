package Linear;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int answer = getIndexFromSearch(arr,target);
        boolean answerBool = getBoolFromSearch(arr,target);
        System.out.println(answer);
        System.out.println(answerBool);
    }

    public static int getIndexFromSearch(int[] arr , int target){
        if (arr.length==0){
            return -1;
        }

        for (int index = 0; index <arr.length ; index++) {
            int element = arr[index];

            if (target==arr[index]){
                return index;
            }
        }

        return -1;
    }

    public static boolean getBoolFromSearch(int[] arr, int target){
        if (arr.length==0){
            return false;
        }
        for (int element:arr) {
            if (element==target){
                return true;
            }
        }
        return false;
    }
}
