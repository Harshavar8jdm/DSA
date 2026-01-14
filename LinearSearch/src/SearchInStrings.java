public class SearchInStrings {
    static void main(){
        String name = "Hello There";
        char target = 'l';
        System.out.println(searchInString(name, target));
        System.out.println(searchInString2(name, target));

    }
    static boolean searchInString(String string, char target){
        for (int i = 0; i < string.length(); i++) {
            if(target == string.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean searchInString2(String string, char target){
        for(char ch: string.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
