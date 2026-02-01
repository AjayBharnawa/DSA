public class Qs6 {
    public static void subarr(int arr[], int start, int end){
        for(int i=start; i<=end; i++){
            int curr = arr[i];
            for(int j=i+1; j<=end;j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                
            }
            curr++;
            System.err.println();

        }
        
    }
    public static void main(String args[]){
        int arr[]= {2,-4,5,-6,7,-3,1,-8};
        int start = 1;
        int end = 4;
        subarr(arr, start, end);
}
}
