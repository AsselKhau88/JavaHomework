package class4;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        /*
        You are a loan specialist,and you need to ask user what is the amount of loan
        is needed. If loan is less or equal to 200,000 then you would lend the money
        otherwise you would reject the client.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("What amount of loan is needed?");
        int amount= scan.nextInt();
         if(amount<=200000) {
             System.out.println("You will get a loan");
         }else{
             System.out.println("You won't get a loan");
         }

    }
}
