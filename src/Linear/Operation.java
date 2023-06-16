package Linear;



public class Operation {
    public static void main(String[] args) {
        int count = countOperations(2,3);
        int count2 = countOperationsAlternate(5,3);
        System.out.println(count2);
        System.out.println(count);
    }

    public static int countOperations(int num1, int num2) {
        return helper(num1,num2,0);
    }

    private static int helper(int num1, int num2, int count) {
        if (num1==0||num2==0){
            return count;
        }else if (num1<num2||num1==num2){
            num2 = num2-num1;
            return helper(num1,num2,count+1);
        }else{
            num1 = num1-num2;
            return helper(num1,num2,count+1);
        }
    }

    public static int countOperationsAlternate(int num1, int num2) {
        int count = 0;

        while (num1!=0&&num2!=0){
            if (num1<num2||num1==num2){
                num2 = num2-num1;
            }else {
                num1 = num1-num2;
            }
            count++;
        }

        return count;
    }
}
