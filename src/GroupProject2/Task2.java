package GroupProject2;

public class Task2 {
    /*
    Check if a String is Palindrome: Determine whether a given string is
    a palindrome, which means it reads the same forwards and
    backward. For example, "madam" is a palindrome.
     */
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
        Task2 p=new Task2();
        boolean result=p.isPalindrome("Madam");
        System.out.println(result);


    }



}

