package class10;

public class HW3 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        Print the sum of all numbers.
        */
        int[][]numbers={
                {15, 25, 35},
                {5, 1, 6},
                {3, 75, 10}
        };
        int sum=0;
        for (int[] number : numbers) {
            for (int total : number) {
                sum=sum+total;
            }
        }

        System.out.println(sum);
    }
}
