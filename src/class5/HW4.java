package class5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        /*
         Write a program for user to enter his/hers birth month. Based on the month define the season.
         Example: if user is born in March, April, May → season = ”Spring”
         if user is born in June, July, August → season =”Summer”  etc …
         At the end of the program we should see 1 output as “You were born is season __”.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month= scan.next();
        if(month.equals("March")) {
            System.out.println("You were born in season Spring");
        }else if(month.equals("April")) {
            System.out.println("You were born in season Spring");
        }else if(month.equals("May")) {
            System.out.println("You were born in season Spring");
        }else if(month.equals("June")) {
            System.out.println("You were born in season Summer");
        }else if( month.equals("July")){
            System.out.println("You were born in season Summer");
        }else if(month.equals("August")){
            System.out.println("You were born in season Summer");
        }else if(month.equals("September")){
            System.out.println("You were born in season Fall");
        } else if (month.equals("October")) {
            System.out.println("You were born in season Fall");
        }else if(month.equals("November")){
            System.out.println("You were born in season Fall");
        }else if (month.equals("December")){
            System.out.println("You were born in season Winter");
        }else if(month.equals("January")){
            System.out.println("You were born in season Winter");
        }else if(month.equals("February")){
            System.out.println("You were born in season Winter");
        }



    }
}
