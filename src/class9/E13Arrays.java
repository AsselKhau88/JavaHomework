package class9;

import java.util.Scanner;

public class E13Arrays {
    public static void main(String[] args) {
        int []numbers=new int[3];
        Scanner scan=new Scanner(System.in);

        for (int row = 0; row < 3; row++) {
            System.out.println("Please enter int numbers");
            numbers[row]=scan.nextInt();
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
