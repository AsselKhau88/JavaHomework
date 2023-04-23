package project2;

public class task1 {
    public static void main(String[] args) {
          /*Create a program that uses an array to store a list of
        temperatures for a week, and then uses a loop to find
        the highest and lowest temperature for the week.
        */
        double[]temp={77.5, 55.6, 90, 101, 55, 63.5, 70};
        double max = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]>max)
                max=temp[i];
        }
        System.out.println(max);

    }
}
