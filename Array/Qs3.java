import java.util.*;
public class Qs3 {
    
    public static int lagrestNum(int arr[]){
        int index = 0;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(index < arr[i]){
                index=arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
            System.out.println("Smallest is : " + smallest);
      return index;
    }
    public static void main(String args[]){
        int arr[] = {0, 2, 13, 8, 3, 23, 5, 9, 99};
        int largest = lagrestNum(arr);
        System.out.println("largest is : " + largest );
    }
}
