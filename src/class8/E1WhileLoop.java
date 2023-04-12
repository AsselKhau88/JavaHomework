package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {

        // to print all the numbers from starting point to an ending point
        //ask the user for starting and ending number
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the starting and an ending point and the step");
        int start= scan.nextInt();
        int end=scan.nextInt();
        int step=scan.nextInt();

        int counter=start;


        while(counter<=end){
            System.out.print(counter+" ");
            counter=counter+step; //counter+=step
        }

    }
    }


