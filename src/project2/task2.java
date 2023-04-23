package project2;

public class task2 {
    public static void main(String[] args) {
         /*
         Create an array of integer values. After the array is
         created, calculate the sum of all stored elements in
         that array.
          */
        int[] numbers = {5, 8, 9, 4, 1};

        int sum=0;

        for (int num : numbers) {
            sum=sum+num; }
        System.out.println(sum);
        sum=0;
    }
}
