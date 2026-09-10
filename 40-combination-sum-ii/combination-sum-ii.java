class Solution {
    static void solve(int candidates[],int target, int idx, List <Integer> output, List <List<Integer>> ans ){
        if(target == 0){
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
        solve(candidates, target-candidates[idx], idx+1, output, ans);

        output.remove(output.size()-1);
         while(idx+1 < candidates.length && candidates[idx] == candidates[idx+1]){
            idx++;
        }

        solve(candidates,target, idx+1, output, ans);
;
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List <List<Integer>> ans = new  ArrayList<>();
        List <Integer> output = new ArrayList<>();
        int idx = 0;

        solve(candidates,target, idx, output, ans);
        return ans;
    }
}