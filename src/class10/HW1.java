package class10;

public class HW1 {
    public static void main(String[] args) {
        /*
        Create 2D array of cars : american, german, korean, italian.
        Then retrieve all values from that array using 2 different loops
         */
        String[][]arr2={
                {"American","German","Korean","Italian"}
        };
        for (String[] arr1 : arr2) {
            for (String car : arr1) {
                System.out.println(car);
            }

        }
        System.out.println();
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                System.out.println(arr2[row][col]);
            }
        }



    }
}
