class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        
        int start = 0;
        int end = nums.length-1;

        while(start <=  end){
            int difference = nums[end] - nums[start];
            ans = ans + difference;
            start++;
            end--;
        }
         return ans;
    }
}