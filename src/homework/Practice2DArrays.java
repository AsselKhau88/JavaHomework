package homework;

public class Practice2DArrays {
    public static void main(String[] args) {


        int[][] numbers = {
                {12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35}
        };
        for (int row = 0; row < numbers.length; row++){
            for (int col = 0; col < numbers[row].length;col++) {
                System.out.print(numbers[row][col]+" ");
            }
        }

        System.out.println("------------------------");

        String[] names=new String[3];
        names[0]="John";
        names[1]="Anna";
        names[2]="Michael";
        for (int i=0; i<names.length; i++) {
            System.out.println(names[i]+" ");
        }
        System.out.println("--------WhileLoop----------------");

        int i=0;
        while(i<5) {
            System.out.println(i);
            i++;
        }
        System.out.println("-----------doWhile-------------");
         int j=0;
        do {
            System.out.println(j);
            j++;
        }while(j<5);


    }
}
