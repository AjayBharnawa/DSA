public class RecursionQs9 {

    public static int friendsPairing(int n){
        if(n == 1 || n ==2){
            return n;
        }

        int fnm1 = friendsPairing(n-1);
        int fnm2 = friendsPairing(n-2);
        int printWays = (n-1) * fnm2;
        int totalPairs = (n-1)+printWays;
        return totalPairs;
    }

    public static void main(String[] args){
        int n = 3;
        System.out.println(friendsPairing(n));

    }

}