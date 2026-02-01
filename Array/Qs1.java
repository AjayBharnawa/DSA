
public class Qs1 {

    public static int linearSearch(int arr[], int key){

        for(int i=0; i<arr.length; i++){
            if(key==arr[i]){
                return i;
        }
    }
    return -1;
    }
    public static void main (String args[]){
        int arr[] = {2,4,5,6,7,23,22,13,5};
        int key = 23;
        int index = linearSearch(arr, key);
        if(index == -1){
            System.out.println("key not found");
        } else {
            System.out.println("key found at index : " + index);
        }

    }
}
