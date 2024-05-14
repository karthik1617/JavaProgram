public class EvenDigit {
    public static void main(String[] args) {
        int nums[]={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int digit=(int)(Math.log10(n))+1;
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
}
