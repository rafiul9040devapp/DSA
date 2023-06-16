package Test;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int[] arr2 = {90,75,18,12,6,4,3,1};
        int target = 9;
        int target2 = 6;

        System.out.println(orderAgnosticBC(arr,target));
        System.out.println(orderAgnosticBC(arr2,target2));
    }

    public static int orderAgnosticBC(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isASE = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (target == arr[mid]) {
                return mid;
            } else if (isASE) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
