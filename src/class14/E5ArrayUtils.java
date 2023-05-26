package class14;

public class E5ArrayUtils {
    /*
    create a method call it contains, it should take an array of int and an
    int number in the method body. It should search the array for that number,
    if number is present in the array, method should return true, otherwise method
    should return false. In a separate class call the method and test it for below
    input {10,20,45} number 20
    */
    /*
    return type=> boolean
    name of the method=> contains
    parameters =>(int [], int num)
    body=>{


    }
    */

    boolean contains(int[] arr,int num){
     boolean isFound=false;
     for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                isFound=true;
            }
            
        }
        return isFound;
        
    }

    public static void main(String[] args) {

            int[] arr={10,20,56};
            int number=10;
            E5ArrayUtils Assel=new  E5ArrayUtils();
            boolean result=Assel.contains(arr,number);
            System.out.println(result);


        }



}
