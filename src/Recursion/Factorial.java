package Recursion;

public class Factorial {
    public static void main(String[] args) {
//        int factorial = getFactorial(5);
//        System.out.println(factorial);
//        int sum = getSum(5);
//        System.out.println(sum);
          System.out.println(getSumOfDigits(1342));
          System.out.println(getProductOfDigits(505));
          getConcept(5);
        //getPrintDigits(5);
       // getPrintDigitsRev(5);
        System.out.println(getReverseNumber(1342));
    }

    private static int getFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }

    private static int getSum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + getSum(n - 1);
    }

    private static int getSumOfDigits(int n) {
        if (n != 0) {
//            int remainder = n % 10;
            return (n%10) + getSumOfDigits(n / 10);
        }
        return 0;
    }
    private static int getProductOfDigits(int n) {
        if (n > 1) {
//            int remainder = n % 10;
            return (n%10) * getProductOfDigits(n / 10);
        }
        return 1;
    }

    private static void getPrintDigits(int n) {
        if (n > 0) {
            System.out.println(n);
            getPrintDigits(n - 1);
        }
    }
    private static void getPrintDigitsRev(int n) {

        if (n > 0) {
            getPrintDigitsRev(n - 1);
            System.out.println(n);
        }
    }

    private static void getConcept(int n){
        if (n>=1){
            System.out.println(n);
            getConcept(--n);
            //--n vs n--
            //n-- works after the function is executed
            //--n works before the function is executed
        }
    }

    private static int getReverseNumber(int n){
       if (n<10){
           return n;
       }
       return (int) ((n%10)*Math.pow(10,(int)Math.log10(n/10)+1) + getReverseNumber(n/10));
    }


}
