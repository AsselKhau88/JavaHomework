package class16;

public class Task1 {
    /*Create a method that will accept an array as parameters and will return a sum
    of all elements from that array. Method should be visibly only within same
    package and accessible by creating an instance/object of the class.
    */

    int sumArr(int[]arr){
        int sum=0;
       // for(int num:arr)
        // sum=sum+num;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
      int sum=task1.sumArr(new int[]{10,10,10});
        System.out.println(sum);
    }

}
