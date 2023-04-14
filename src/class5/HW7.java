package class5;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        /*
        Allow user to enter grade (A, B, or C etc...) and then provide explanation:
        A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
        At the end your program should print which grade was entered by a user with explanation.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your grade");
        char grade=scan.next().charAt(0);
        if(grade=='A') {
            System.out.println("Excellent");
        } else if (grade=='B') {
            System.out.println("Good");
        }else if(grade=='C'){
            System.out.println("Average");
        }else if(grade=='D') {
            System.out.println("Bad");
        }else{
            System.out.println("Not Acceptable");
        }

    }
}
