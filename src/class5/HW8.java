package class5;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        /*
       Using scanner class create calculator.
       Allow user to enter 2 numbers and operator(+,-,*,/).
       Based on operator provide the result to user.
       Please complete this assignment in 2 ways: using if statement and switch case.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Please enter operator");
        char operator = scan.next().charAt(0);
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        }

        System.out.println("-------------Switch Statement method------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.println("Please enter sign");
        char sign = scan.next().charAt(0);
        switch(sign){
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case'/':
                System.out.println(n1/n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
        }
    }
}

