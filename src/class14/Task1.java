package class14;
/*
   Write code that will take in a String input and check to see
   if it is a palindrome or not. A palindrome means that the characters
   are the same forwards and backwards, ignoring spaces. Ex: madam kayak
    */
public class Task1 {
    // car => rac (not same)
    //Madam => madaM (same)
    boolean isPalindrome(String str){
        String reversedStr="";
        for (int i = str.length()-1; i >=0; i--) {
            reversedStr=reversedStr+str.charAt(i);
        }
        boolean isPalindrome=false;
        if(str.equalsIgnoreCase(reversedStr)){
            isPalindrome=true;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        boolean result=task1.isPalindrome("Madam");
        System.out.println(result);


    }



}
