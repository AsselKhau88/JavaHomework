package class9;

public class E2Arrays {
    public static void main(String[] args) {
         /*
        create an array of int and store numbers from 30 40 50 90 inside it
        and access only the number 50
         */

        int [] num={30, 40, 50 ,90};
        System.out.println(num[2]);
        //
        int[] numbers={30,-5,50,90};
        /*
        When we try to access an element using an index which does not exist
         */
        // System.out.println(numbers[20]); there is only 4 elements which means 4 indexes(0,1,2,3)
        //ArrayIndexOutOfBoundsException
        // System.out.println(numbers[-5]);
        System.out.println(numbers[1]);

    }
}
