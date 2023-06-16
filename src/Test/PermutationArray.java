package Test;

public class PermutationArray {
    public static void main(String[] args) {
        int[] num = {0,2,1,5,3,4};
        for (int j:
                buildArray(num)) {
            System.out.println(j);
        }
    }

    private static int[] buildArray(int[] num) {
        int length = num.length;
        int[] ans = new int[length];

        for (int i = 0; i <=length-1 ; i++) {
            ans[i] = num[num[i]];
        }

        return ans;
    }
}
