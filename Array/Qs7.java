public class Qs7 {
    public static void majorityElement(int arr[], int n){
        int count = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        System.out.println("count = " + count);

    }
    public static void main (String args[]){
        int arr[] = {3, 2, 3};
        int n = arr.length;
        majorityElement(arr, n);
        }
}
