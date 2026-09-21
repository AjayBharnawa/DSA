class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int start = 0;
        int end  = skill.length-1;
        int totalSkill = skill[start] + skill[end];
        long sum = 0;

        while(start < end){
           if(skill[start] + skill[end] != totalSkill){
           return -1;
           } else {
            sum += (long) skill[start]*skill[end];
            start++;
            end--;
           }
        } 
        return sum;
    }
}