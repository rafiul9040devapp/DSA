package Test;

public class Fibonacchi {

    public static void main(String[] args) {

        for (int n =0;n<=(7-1);n++){
            System.out.println(fibo(n));
        }

        System.out.println(isPowerOfTwo(16));
    }

    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        return (n & (n-1)) == 0;
    }

    static int fibo(int n){
        if (n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
