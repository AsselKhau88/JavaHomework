package class7;

public class E12WhileLoop {
    public static void main(String[] args) {
        /*
        Print numbers from 100 to 1
        Print even numbers from 20 to 100
        Print only odd numbers from 100 to 1
         */


        int number=100;
        while(number>=1){ // same as writing counter>0
            System.out.print(number+" ");
            number-=1;
        }

             int counter=20;
            System.out.println(); // we are assigning a new value to the counter for next loop
            while (counter<=100){
                System.out.print(counter+" ");
                counter+=2;
            }
            int a=100;
             System.out.println(); // so that we can see the next output on new line
              while(a>=1){
                  //odd numbers when divided by 2 gives 1 as remainder
                if(a%2==1) { //or a%2!=0
                    System.out.print(a+" ");
                }
                a--;
              }
    }
}


