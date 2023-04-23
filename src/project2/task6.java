package project2;

public class task6 {
    public static void main(String[] args) {
         /*
         Write a java program to check whether a given
         number is prime or not
            */
        int[][]numbers={
                {4,6,3,5,7},
                {2,9,1,8}
        };
        for (int[] number : numbers) {
            for (int value : number) {
                if(value%2!=0){
                    System.out.println("number " +value+ " is prime");
                }

            }
        }

    }
}
