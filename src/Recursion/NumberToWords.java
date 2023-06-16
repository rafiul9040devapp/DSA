package Recursion;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(numberToWords(34));
    }
    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] thousands = {"", "Thousand", "Million", "Billion"};
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (num > 0) {
            if (num % 1000 != 0) {
                result.insert(0, helper(num % 1000) + thousands[i] + " ");
            }
            num /= 1000;
            i++;
        }
        return result.toString().trim();
    }
    private static String helper(int num) {
        if (num == 0) {
            return "";
        }
        String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (num < 20) {
            return belowTwenty[num] + " ";
        } else if (num < 100) {
            return tens[num / 10] + " " + belowTwenty[num % 10];
        } else {
            return belowTwenty[num / 100] + " Hundred " + helper(num % 100);
        }
    }

}
