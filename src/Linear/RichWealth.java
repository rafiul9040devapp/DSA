package Linear;

public class RichWealth {
    public static void main(String[] args) {
        int[][] nums = {
                {1,2,3},
                {4,1,6},
                {3,3,7}
        };

        int result = (int) Math.sqrt(8);
        System.out.println(result);

        System.out.println(getMAXWealth(nums));
    }

    private static int getMAXWealth(int[][] nums) {
        int max = Integer.MIN_VALUE;
        for (int[] person : nums) {
            int totalBalance = 0;
            for (int accountBalance : person) {
                totalBalance += accountBalance;
            }
            if (totalBalance > max) {
                max = totalBalance;
            }
        }
        return max;
    }
}
