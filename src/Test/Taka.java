package Test;

public class Taka {
    public static void main(String[] args) {
        int[] moneyASE = {1,2,5,10,20,50,100,200,500,1000};
        int[] moneyDSE = {1000,500,200,100,50,20,10,5,2,1};
        int change1=100;
        int change2=1000;
        System.out.println(getTheNotesInChange(moneyASE,change1));
        System.out.println(getTheNotesInChange(moneyDSE,change2));
    }

    private static int getTheNotesInChange(int[] money, int change) {
        int start = 0;
        int end = money.length-1;
        boolean isASE = money[start]<money[end];

        while (start<=end){
            int mid = start + ((end-start)/2);

            if (change == money[mid]){
                return mid;
            }else if (isASE){
                if (change > money[mid]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }else {
                if (change<money[mid]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
