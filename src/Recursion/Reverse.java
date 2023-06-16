package Recursion;

public class Reverse {

    static int sum = 0;

    public static void reverserNumber(int n) {
        if (n == 0) {
            return;
        }
        int remainder = n % 10;
        sum = sum * 10 + remainder;
        reverserNumber(n / 10);
    }

    private static int reverserNumberAlternate(int n) {

        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int remiander = n % 10;
        return (int) (remiander * Math.pow(10, digits - 1) + helper(n / 10, digits - 1));
    }

    private int myNumberReverse(int n) {
        if (n % 10 == n) {
            return n;
        }
        int remainder = n % 10;
        int remaining = n / 10;
        return (int) (remainder * Math.pow(10, (int) Math.log10(remaining) + 1)) + myNumberReverse(remaining);
    }

    private boolean isPalindrome(int n) {
        return n == myNumberReverse(n);
    }

    private int countSpecificNumber(int n, int count) {
        if (n % 10 == 0) {
            return countSpecificNumber(n / 10, count + 1);
        } else if (n % 10 == n) {
            return count;
        } else {
            return countSpecificNumber(n / 10, count);
        }
    }

    private int countSteps(int n, int steps) {
        if (n == 0) {
            return steps;
        }
        if (n % 2 == 0) {
            return countSteps(n / 2, steps + 1);
        }
        return countSteps(n - 1, steps + 1);
    }

    public static void main(String[] args) {
        reverserNumber(212);
        System.out.println(sum);

        System.out.println(reverserNumberAlternate(243));

        Reverse reverse = new Reverse();
        System.out.println(reverse.myNumberReverse(2002));
        System.out.println("Palindrome: " + reverse.isPalindrome(2002));
        int count = reverse.countSpecificNumber(20202020, 0);
        System.out.println(count);
        int countSteps = reverse.countSteps(41, 0);
        System.out.println(countSteps);
    }


}
