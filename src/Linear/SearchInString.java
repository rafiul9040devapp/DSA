package Linear;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'b';
        boolean answerBool = searchTheString(name,target);
        System.out.println(answerBool);
    }

    private static boolean searchTheString(String name, char target) {
        if (name.length()==0){
            return false;
        }

        for (char c: name.toCharArray())
            if (c == target) {
                return true;
            }

//        for (int i = 0; i <name.length() ; i++) {
//            if (target==name.charAt(i)){
//                return true;
//            }
//        }
        return false;
    }
}
