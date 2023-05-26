package class14;

public class Task2 {
    boolean isPalindrome(String str) {


        /*
        new StringBuilder(str)=> converts the String to a StringBuilder
        reverse() => it reverses the contents in StringBuilder
        toString()=> it converts the StringBuilder back to a String
        equalsIgnoreCase(str)=> comparing the reversed String to original one
         */
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        boolean result=task1.isPalindrome("Madam");
        System.out.println(result);

    }
}
