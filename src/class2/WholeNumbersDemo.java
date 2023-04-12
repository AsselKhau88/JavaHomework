package class2;

public class WholeNumbersDemo {
    public static void main(String[] args) {
        byte age=100;

        System.out.println(age);
        short noOfApples=300;
        System.out.println(noOfApples);
        // int is the most widely used data to store whole numbers
        int bankBalance=1000000;
        System.out.println(bankBalance);
        /*
        all the whole numbers by default are treated as int whenever we have tro store
        a number which is beyond the range of int we have to explicitly write the letter
        'L' at the end to tell java we are dealing with a special very large number
        */


        long populationNumber= 5_222_222_226_541L;
        System.out.println(populationNumber);


    }
}
