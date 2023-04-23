package project2;

public class task3 {
    public static void main(String[] args) {
         /*
        Create a 2D array of integer type where you will store
        odd and even numbers. Develop a program which will
        identify/print the even numbers only.
        */

        int[][] numbers={
                {4,9,8,7},
                {5,12,25,10}
        };
        for (int[] number : numbers) {
            for (int value : number) {

                if(value%2==0){
                    System.out.println(value);
                }

            }


        }
    }
}
