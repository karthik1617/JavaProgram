import java.util.Arrays;

public class ConcatenateArray {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] ans=getConcatenation(a);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] getConcatenation(int[] nums) {
        int arr[]=new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            arr[i]=nums[i];
        }
        for (int i = nums.length; i < nums.length*2 ; i++) {
            arr[i]=nums[i-nums.length];
        }
        return arr;
    }
}

