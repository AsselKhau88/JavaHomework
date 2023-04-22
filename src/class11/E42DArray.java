package class11;

public class E42DArray {
    public static void main(String[] args) {
        int[][] arr2D = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        //print only odd numbers from this 2dd array using loop

        // arr[i]=> gives me the array at specific index by 1
        //int[] innerArray=arr[i]; => innerArray.length

      for (int[]arr1D:arr2D){
          for (int num:arr1D)
              System.out.print(num+" ");
          System.out.println();
      }


    }
    }



