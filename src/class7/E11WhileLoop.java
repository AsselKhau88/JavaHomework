package class7;

public class E11WhileLoop {
    public static void main(String[] args) {
        //1 2 4 5 7 8 10 11 13 14 16 17 19 20
        int b=1;
        while (b<=20) {
            // we could use these if(b<=3 && b!=6)
            // or if(counter%3==0
            if (b%3!=0) {
                System.out.print(b + " ");
            }
            b ++;

        }
    }
}
