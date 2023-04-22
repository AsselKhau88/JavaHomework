package class11;

public class Task3 {
    public static void main(String[] args){

        int [] arr = new int [] {5,4,8};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++){

            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }

}

