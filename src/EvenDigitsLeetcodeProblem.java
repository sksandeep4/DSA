//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigitsLeetcodeProblem {
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 555, 9573};
        System.out.println(findNumbers(arr));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        if(digits(num) %2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        if(num <0){     //if num is negative, convert it into positive and count digit
            num *= -1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
