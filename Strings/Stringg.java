import java.util.Scanner;
public class Stringg {

    public static void printLetters(String fullName){
        for(int i=0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i));
        }
    }

    public static void main(String args[]){
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str9 = new String("xyz");

        // Strings are IMMUTABLE in java (unchangable)


        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.next();  // nextLine(); to take full line as input 
        // System.out.println(name);
        // sc.close();

        //Length of String :-
        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());


        // Concatenation
        // String firstName = "Ajay";
        // String lastName = "Bharnawa";
        // String fullName = firstName + " " + lastName;

        // System.out.println(fullName);
        // System.out.println(fullName.length());
        // System.out.println(fullName.charAt(5));

        // printLetters(fullName);


        //String Comparision
        String str1 = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony"); 
        
        if(str1 == str2){
            System.out.println("Strings are equal");
        } else {
             System.out.println("String are not equal");
            }
         if(str2 == str3){
            System.out.println("Strings are equal");
        } else {
             System.out.println("String are not equal");
            }

            if(str1.equals(str3)){
            System.out.println("Strings are equal");
        } else {
             System.out.println("String are not equal");
            }
    }
    
}
