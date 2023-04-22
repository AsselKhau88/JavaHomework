package class11;

public class Task2 {
    public static void main(String[] args) {


            double[][] arr = {
                    {1.4,2.0,3.3,2},
                    {4,1.5,6.1,1},
                    {1.2,3.1,4,1.6}
            };
            for(int row=0; row < arr.length; row++){
                for(int col=0; col< arr[row].length; col++){
                    System.out.print((arr[row][col]*2)+" ");
                }
                System.out.println();
            }
    }
}
