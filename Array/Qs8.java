public class Qs8 {

    public static void maxSum( int nums[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<nums.length; i++){
            cs = cs + nums[i];
           
            ms = Math.max(cs, ms);
        }
        System.out.print(" Maximum sum is : " + ms);
    }


    public static void main(String args[]){

        int[] nums= {-2, -3, 4, -2, 7, 3, -1, 6, -2};
        maxSum(nums);
    }
}
