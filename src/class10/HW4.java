package class10;

public class HW4 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        Develop a program which will identify/print the even numbers only.
         */
        int [][]numbers={
                {5,8,6,9},
                {45,6,3,74},
                {102,8,5,6}
        };
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                int element=numbers[row][col];
                if(element%2==0){
                    System.out.println(element);

                }

            }

        }



    }
}
