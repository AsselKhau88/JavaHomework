package class11;

public class Task4 {
    public static void main(String[] args) {
        int[][] arr2 = {
                {-5,-2,-3, 7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}
        };
        int sum=0;
        for (int[] arr1 : arr2) {
            for (int num : arr1) {
        sum=sum+num;}
            System.out.print(sum+"  ");
            sum=0;
        }
    }
}




