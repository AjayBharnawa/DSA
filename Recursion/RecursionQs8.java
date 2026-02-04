public class RecursionQs8 {
    public static int tilingProblem(int n){
        if(n == 1 || n==2){
            return n;
        }

        int fnm1 = tilingProblem(n-1);
        int fnm2 = tilingProblem(n-2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(tilingProblem(n));
    }

}