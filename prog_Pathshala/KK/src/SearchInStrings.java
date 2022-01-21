public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Asif";
        char target = 'i';

        System.out.println(searchStr2(str, target));
    }

     static boolean searchStr(String str, char target) {

        if(str.length() == 0){
            return false;
        }

         for (int i = 0; i < str.length(); i++) {
             if(target == str.charAt(i)){
                 return true;
             }
         }

         return false;
    }

    static boolean searchStr2(String str, char target) {

        if(str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()) {
            if( ch == target){
                return true;
            }
        }

        return false;
    }
}
