public class Qs2 {

    public static int strSearch(String[] arr, String key){
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        String[] arr = {"aloo", "pyaz", "matar", "tamatar", "bhindi", "nimbu"};
        String key = "ajay";
        int index = strSearch(arr, key);
        if(index == -1){
            System.out.println("Key not found");
        } else {
            System.out.println("key found at : " + index);
        }
    }
}
