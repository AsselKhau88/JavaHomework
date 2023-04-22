package class10;

public class HW2 {
    public static void main(String[] args) {
        /*
        Using 2D array create a grocery list.
        Inside you should have an array of veggies, fruits, dairy and sweets.
        Retrieve all values from that array using 2 different loops
        */
        String [][]groceryList2={
                {"Veggies","Fruits","Dairy","Sweets"}
        };
        for (int row = 0; row < groceryList2.length; row++) {
            for (int col = 0; col < groceryList2[row].length; col++) {
                System.out.println(groceryList2[row][col]);
            }
        }
        System.out.println();
        for (String[]groceryList1 : groceryList2) {
            for (String list : groceryList1) {
                System.out.println(list);

            }

        }

    }
}
