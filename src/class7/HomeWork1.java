package class7;

public class HomeWork1 {
    //Print odd numbers between 20 and 50 (2 ways)
    public static void main(String[] args) {
        int c=20;
        while (c<=50){
            if(c%2!=0)
                System.out.print(c+" ");
            c++;
        }
        System.out.println();
        for (int i = 20; i < 50; i++) {
            if (i%2!=0)
                System.out.print(i+" ");
        }

    }
}
