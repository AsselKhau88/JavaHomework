package class9;

public class HM1 {
    public static void main(String[] args) {
        /*
        Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of creating an array).
         */
        String [] names={"Assel","Alina","John","Emir"};
        System.out.println(names[0]);

        String[]names1=new String[4];
        names1[0]="Assel";
        names1[1]="Alina";
        names1[2]="John";
        names1[3]="Emir";
        System.out.println(names1[0]);
    }



}
