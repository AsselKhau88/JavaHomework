package project2;

public class task8 {
    public static void main(String[] args) {
          /*
        Maximum and minimum number in the array?
         */
        int[]numbers={2,5,9,41,-5,63};
         int max=numbers[0];
        int min=numbers[0];
        for (int number : numbers) {
            if (number > max) max = number;
            {
                System.out.println(number);

            }
        }


    }
}
