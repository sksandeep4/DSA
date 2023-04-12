import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5}, {4, 3, 7}, {9, 1, 6}};
        System.out.println(Arrays.toString(search2d(arr, 7)));
    }
    static int[] search2d(int[][] arr, int target){
        for(int row = 0;row < arr.length; row++){
            for(int col = 0;col < arr[row].length; col++){
                if(target == arr[row][col]){
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
