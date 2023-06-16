package Recursion;

public class CubeOfOdd {
    public static void main(String[] args) {
        int valueOfLastIndex = 11;
        int lastIndex = (valueOfLastIndex+1)/2;
        int result = getSumOfSeries(lastIndex);
        System.out.println(result);
        int result2 = getSumOfSeriesAlternate(lastIndex);
        System.out.println(result2);
    }

    private static int getSumOfSeries(int lastIndex)
    {
        if (lastIndex>0){
            int value = (2*lastIndex)-1;
            int cube = (int) Math.pow(value,3);
            return cube+getSumOfSeries(lastIndex-1);
        }
        return 0;
    }
    private static int getSumOfSeriesAlternate(int lastIndex) {
        int power = (int) Math.pow(lastIndex,2);
        int sum = power*((2*power)-1);
        return sum;
    }
}
