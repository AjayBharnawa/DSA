class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i] ==nums[i-1]){
                continue;
            }

        int left = i+1;
        int right = n-1;
        int temp = 0-nums[i];
        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum == temp){
                List<Integer> triplet = new ArrayList<>();
                triplet.add(nums[i]);
                triplet.add(nums[left]);
                triplet.add(nums[right]);
                ans.add(triplet);
                left++;
                right--;
            

            while(left>0 && left<right && nums[left]== nums[left-1]){
                left++;
            }

            while(right<n-1 && left<right && nums[right] == nums[right+1]){
                right--;
            }
        }
            else if(sum < temp){
                left++;
            } else {
                right--;
            }
        }
        }
        return ans;
    }
}