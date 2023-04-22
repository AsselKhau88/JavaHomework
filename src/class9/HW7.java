package class9;

public class HW7 {
    public static void main(String[] args) {
        /*
        Create an array to store char values and then print those in reverse order
         */
char[] grades=new char[3];
grades[0]='A';
grades[1]='B';
grades[2]='C';
        for (int i = 2; i >=0 ; i--) {
            System.out.println(grades[i]);

        }


        }
    }
