package Linear;

public class EvenDigits {
    public static void main(String[] args) {
     int number = 3254789;
        System.out.println( getDigits(number));
        System.out.println( getDigits2(number));

      int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(findNumbers2(nums));
    }

    public static int findNumbers(int[] nums) {

        int count = 0;
        for (int element:nums) {
            if (getDigits(element)%2==0){
                count++;
            }
        }
        return count;
    }
    private static int getDigits(int number) {

        if (number<0){
            number = number*-1;
        }

        if (number==0){
            return 1;
        }

        int digit = 0;
        while (number>0){
            digit++;
            number = number/10;
        }
        return digit;
    }
    private static int getDigits2(int number) {

        if (number<0){
            number = number*-1;
        }

        if (number==0){
            return 1;
        }

        return (int)(Math.log10(number))+1;
    }

    public static int findNumbers2(int[] nums) {

        int count = 0;
        for (int element:nums) {
            if (String.valueOf(element).length()%2==0){
                count++;
            }
        }
        return count;
    }
}
