package class9;

public class HW3 {
    public static void main(String[] args) {
        /*
        Create an array of cars and store 6 elements into it.
        Using 2 different loops print all values from the array.
         */
        String[] cars2 = {"BMW", "Mercedes", "Toyota", "Kia", "Porsche", "Lada"};
        for (String car : cars2) {
            System.out.println(car);
        }
        System.out.println();
        String[] cars = new String[6];
        cars[0] = "BMW";
        cars[1] = "Mercedes";
        cars[2] = "Toyota";
        cars[3] = "Kia";
        cars[4] = "Porsche";
        cars[5] = "Lada";
        for (int i = 0; i < 6; i++) {
            System.out.println(cars[i]);
        }
        System.out.println();
        int i=0;
        while(i< 6){
            System.out.println(cars[i]);
            i++;

        }


    }
}
