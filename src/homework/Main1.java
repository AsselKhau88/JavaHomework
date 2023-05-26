package homework;

public class Main1 {
    static int sumArr(int [] []arr){
            int sum = 0;
            for (int[] arr1D : arr) {

                for (int num : arr1D) {


                    sum = sum + num;

                }

            }

            return sum;
        }


    }



    class mainTester extends Main1{

        public static void main(String[] args) {

            Main1 obj=new Main1();

            int [] []a={

                    { 1, 2, 3 },

                    { 4, 5, 6 },

                    { 7, 8, 9 }
            };

            int result=obj.sumArr(a);
            System.out.println(result);
        }

    }

