class Solution {
    static void solve(int candidates[],int target, int idx, List <Integer> output, List<List<Integer>> ans, int  count, int k){
        if(count > k){
            return;
        }
        if(count == k && target == 0){
            ans.add(new ArrayList(output));
            return;
        }
        if (idx >= candidates.length){
            return;
        }
        if (target < 0){
            return;
        }

        output.add(candidates[idx]);
        solve(candidates, target-candidates[idx], idx+1, output, ans, count+1, k);

        output.remove(output.size()-1);
         while(idx+1 < candidates.length && candidates[idx] == candidates[idx+1]){
            idx++;
        }

        solve(candidates,target, idx+1, output, ans, count, k);
;
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        //Arrays.sort(candidates);
        List <List<Integer>> ans = new  ArrayList<>();
        List <Integer> output = new ArrayList<>();
        int idx = 0;
        int target = n;
        int candidates[] = { 1,2,3,4,5,6,7,8,9};
        int count = 0;
        solve(candidates,target, idx, output, ans, count, k);
        return ans;
    }
}