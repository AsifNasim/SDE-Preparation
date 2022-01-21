public class SearchInRange {
    public static void main(String[] args) {
        String str = "Nasim";
        char target = 's';
        System.out.println(searchInRange(str, target, 0, 3));
    }


    static boolean searchInRange(String str, char target, int sI, int eI) {

        if(str.length() == 0){
            return false;
        }

        for (int i = sI; i <= eI; i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }
}
