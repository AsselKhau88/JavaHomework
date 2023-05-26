package class13;

import java.util.Scanner;

public class HW2 {
    /*
   Write a program that reads two people's first names and if they are expecting boy or girl?
   Based on the input suggests a name for a baby:

   Example Output:
   Mom’s first name? Mary
   Dad’s first name? Daniel
   Boy or Girl? boy
   Suggested baby name: DANRY

   Example Output:
   Mom’s first name? Mary
   Dad’s first name? Daniel
   Boy or Girl? girl
   Suggested baby name: MAIEL
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Mom's first name?");
        String name = scan.next();

        System.out.println("Dad's first name?");
        String name1 = scan.next();

        System.out.println("Boy or Girl?");
        String gender = scan.next();


        if (gender.equals("girl")){
            System.out.println("Suggested baby name is: "+name.substring(0, name.length()/2)+name1.substring(name1.length()/2,name1.length() ));
        } else if (gender.equals("boy")){
            System.out.println("Suggested baby name is: "+name1.substring(0, name1.length()/2)+name.substring(name.length()/2,name.length()));
        }

        }
    }

