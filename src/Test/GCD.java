package Test;

public class GCD {

    public static int gcd(int a ,int b){
        return b==0 ? a : gcd(b,a%b);
    }

    public static String gcdOfString(String s1, String s2){
        if (!(s1+s2).equals(s1+s2)){
            return "";
        }
        else {
            return s1.substring(0,gcd(s1.length(),s2.length()));
        }
    }

    public static int reverse(int a ){
        int sum = 0 ;
        int remainder;

        while (a!=0){
            remainder = a%10;
            sum = (sum*10) + remainder;
            a = a/10;
        }
        return sum;
    }

    public static boolean isPalindrome(int a ){
        if (a == reverse(a)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int z = 121;
        String a = "ABABAB";
        String b = "ABAB";

        if (x>y){
            System.out.println(gcd(x,y));
        }else {
            System.out.println( gcd(y,x));
        }

        if (a.length()>b.length()){
            System.out.println(gcdOfString(a,b));
        }else {
            System.out.println(gcdOfString(b,a));
        }

        System.out.println(reverse(z));
        System.out.println(isPalindrome(z));

        System.out.println(myPow(2,-2));
    }

    public static double myPow(double x, int n) {

        double result = Math.pow(x,n);
        return result;
    }

}
