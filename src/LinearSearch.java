public class LinearSearch {
    public static void main(String[] args) {
        int[] n = {21, 5, 2, 8, 13};
        System.out.println(linearSearch(n, 5));

    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){    //Empty Array
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1; // target not found
    }
}
