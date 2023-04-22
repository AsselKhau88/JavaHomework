package class11;

public class E72DArray {
    public static void main(String[] args) {
        boolean[][] arr2D = {
                {true,false,true,true,false},
                {true,false,false,false,false}
        };
        // with the help of loops count how many times we have true in above 2DArray
        int counter=0;
        for (boolean[] arr1D : arr2D) {
            for (boolean value : arr1D) {
                if (value == true) {
                   counter++;
                }
            }
        }
        System.out.println(counter);
     }
}











