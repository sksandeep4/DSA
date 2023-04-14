public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 11, 18, 22, 34, 41, 54, 67};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println((binarySearch(arr, 11)));
    }
    static int binarySearch(int[] a, int target){
        int start = 0;
        int end = a.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target < a[mid]){
                end = mid - 1;
            }else if(target > a[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
