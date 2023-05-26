package homework;

import java.util.Scanner;

public class Replit99 {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("In:");
            String givenString = scan.nextLine();
            //write your code below
            boolean isEqual=true;
            StringBuilder givenString1=new StringBuilder(givenString);
            givenString1=givenString1.reverse();
            String reversed=givenString1.toString();
            if(givenString.equalsIgnoreCase(reversed)){
                System.out.print(isEqual);
            }else{
                System.out.print(!isEqual);}


        }

    }


