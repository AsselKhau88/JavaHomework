package class8;

public class E3WhileLoop {
    public static void main(String[] args) {
        //write a loop to add all the even numbers from 1 to 10
           int sum=0; // creating a variable to hold the sum
        for (int counter = 1; counter <=10; counter++){
            if(counter%2==0){ // checking if number is even
                sum=sum+counter; // sum+=counter; //adding all the even numbers to the sum variable one by one
            }
        }System.out.print(sum);
    }
}

