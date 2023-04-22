package class9;

public class HW4 {
    public static void main(String[] args) {
        /*
         Create an array of animals and store 5 elements into it.
         Using 2 different loops print all elements from the array.
        */
        String[]animals=new String[5];
        animals[0]="Lion";
        animals[1]="Tiger";
        animals[2]="Zebra";
        animals[3]="Wolf";
        animals[4]="Deer";
        for (int i = 0; i < 5; i++) {
            System.out.println(animals[i]);
        }

        System.out.println();
        int i=0;
        while(i<5){
            System.out.println(animals[i]);
            i++;


           /* System.out.println();
            String[]animals2={"Lion","Tiger","Zebra","Wolf","Deer"};
            for(String animal:animals2){
            System.out.println(animal);
           */
        }
        }

    }

