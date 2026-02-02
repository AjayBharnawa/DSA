public class RecursionQs5 {

    public static int printFib(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int fnm1 = printFib(n-1);
        int fnm2 = printFib(n-2);
        int fn = fnm1 + fnm2;
        return fn;

    }

    public static void main(String[] args){
        int n = 10;
        System.out.println(printFib(n));
    }
    
}
