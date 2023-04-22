package class10;

public class Task {
    public static void main(String[] args) {
        int[][] numbers={
                {12,13,14,15,16},
                {21,22,23,24,25},
                {31,32,33,34,35}
        };
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(numbers[row][col]+" ");

            } System.out.println();


        }


    }
}
