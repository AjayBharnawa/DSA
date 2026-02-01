public class Qs5 {
    public static void printPairs(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr=arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }


    public static int[] twoSum(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] +arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int arr[] = {2,9,5,3,7,4};
        int target = 5;
       // printPairs(arr);
     int[] result = twoSum(arr, target); 

        if (result[0] == -1) {
            System.out.println("No pair found");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + arr[result[0]] + ", " + arr[result[1]]);
        }
    }
    }

