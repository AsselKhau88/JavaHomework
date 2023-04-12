package homework;

import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your marks");
        int mark=scan.nextInt();
        char grade = scan.next().charAt(0);
        if(mark>1||mark<25){
            System.out.println("Your grade is " + 'F');
        }else if(mark==25||mark<=45) {
            System.out.println("Your grade is " + 'E');
        }else if(mark==45||mark<=50){
            System.out.println("Your grade is " + 'D');
        }else{
            System.out.println("Please enter valid mark");
        }
    }
}
