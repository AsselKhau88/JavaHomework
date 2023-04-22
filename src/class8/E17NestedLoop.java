package class8;

import java.util.Scanner;

public class E17NestedLoop {
    public static void main(String[] args) {
        for(int i=7; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int j = 2; j <= 7; j++) {
            for (int a = 1; a <= j; a++) {
                System.out.print(a + " ");
            }


            System.out.println();
        }
    }}


