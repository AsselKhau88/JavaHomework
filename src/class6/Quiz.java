package class6;

import java.util.Scanner;

public class Quiz {
    //Prompt the user to enter person heights in inches. Person should be classified as one of the following:
    //short (under 60 inch)
    //medium(between 60 -72 inch)
    //tall (over 72 inch)
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your height in inches");

        int height=scan.nextInt();

         if(height<60){
             System.out.println("Short");
         } else if (height==60) {
             System.out.println("Medium");
         } else if (height<72) {
             
         }else if(height>=60 && height<=72){
             System.out.println("Medium");
         }else{
             System.out.println("Tall");
         }
    }
}
