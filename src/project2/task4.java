package project2;

public class task4 {
    public static void main(String[] args) {
          /*
         Create a 2D array of integers. Develop a program
          which will calculate the sum of even and odd numbers
          for that array
         */
        int[][]numbers= {
                {8, 15, 13, 4, 9},
                {3, 6, 2, 7, 15}
        };
        int sum=0;
        for (int[] number : numbers) {
            for (int value : number) {
                sum=value+sum;



            }
        }System.out.println(sum);



    }
}
