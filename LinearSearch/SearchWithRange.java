public class SearchWithRange {
    public static void main(String[] args) {
        int[] n = {21, 5, 2, 8, 13};
        System.out.println(searchInRange(n, 21, 1, 4));
    }
    static int searchInRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){    //Empty Array
            return -1;
        }
        for(int i = start; i <= end; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1; // target not found
    }
}
