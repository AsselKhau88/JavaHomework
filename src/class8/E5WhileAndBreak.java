package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {
        //create a boolean variable summer and store true in it, then write a loop
        //that runs as long as it is summer create a temp variable and store 85.
        // Inside the loop check the temp if it less than 100 print "it is good I enjoy summer"
        //as soon as temp exceeds 100 print "it is very hot" and break the loop with breack ketword

        boolean summer=true;
        int temp=85;
        while(summer){
            if(temp<100){
                System.out.println("It is good I enjoy summer");
            } else {
                System.out.println("It is very hot");
                break;
            }
               temp=temp+3;
        }
    }
}
