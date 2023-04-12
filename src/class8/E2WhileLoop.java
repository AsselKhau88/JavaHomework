package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {

        //in a while loop ask the user to enter numbers is user enters any number
        //other than -1 print "Hello world" and keep on asking the user for a number
        // the moment user enters the number -1 the loop should stop
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scan.nextInt();

        while(num!=-1){
            System.out.println("Hello world");
            num=scan.nextInt();

        }
    }
}
