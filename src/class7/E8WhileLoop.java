package class7;

public class E8WhileLoop {
    public static void main(String[] args) {
        //print these numbers in one line 3 5 7 9 11 13 with a while loop
        int counter=3;
        while(counter<=13){
           // in order to get the output in line version not column we need to remove "ln" in println
            //println means new line when just print means print in same line
            System.out.print(counter+ " ");
            counter+=2;
        }



    }
}
