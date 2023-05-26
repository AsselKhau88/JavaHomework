package project2;

import java.util.Scanner;

public class Repl104 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[]arr=new String[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=scan.next();
        }
        for(int i=0;i<arr.length;++i){
            System.out.println(arr[i].substring(0,3));
        }
    }
}
