public class searchInStrings {
    public static void main(String[] args) {
        System.out.println(search("Linear Search", 'm'));
    }
    static boolean search(String str, char letter){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == letter){
                return true;
            }
        }
        return false;
    }
}
