import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("In:");
        String s = scan.nextLine();
        //write your code below
        StringBuilder s2=new StringBuilder(s);

        s2.reverse();
        s=s2.toString();
        for (int i = s.length(); i >= s.length(); i--) {

            System.out.println(s);
        }





    }
}