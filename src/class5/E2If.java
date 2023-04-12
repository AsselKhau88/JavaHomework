package class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in); // This code helps us to get any type of data from the console
        System.out.println("is it time for a break true/false"); // this line print the text inside the "" in the console

        boolean isBreak=input.nextBoolean(); // we are creating a variable of type boolean and calling it is break
        // the"input"=> is also a variable of type scanner
        //nextBoolean()=> this is a method that helps us take boolean type data from the keyboard
        // =(equal sign) => will store that value inside the isBreak variable
        if(isBreak){
            System.out.println("Lets have a break");
        }
    }
}
