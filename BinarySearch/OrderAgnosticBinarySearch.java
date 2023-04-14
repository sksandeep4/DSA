public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 11, 18, 22, 34, 41, 54, 67};
        int[] arr2 = {4, 3, 2, 1, };
        System.out.println((binarySearch(arr, 34)));
    }
    static int binarySearch(int[] a, int target){
        int start = 0;
        int end = a.length - 1;
        boolean isAsc = a[start] < a[end];


        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(a[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < a[mid]){
                    end = mid - 1;
                }else if(target > a[mid]){
                    start = mid + 1;
                }
            }
            else{
                if(target > a[mid]){
                    end = mid - 1;
                }else if(target < a[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
