package class14;
 /*
     Write a method to return whether given number is prime or not?
     */
// return type=> boolean
// name of the method=> isPrime
// parameters=> (int number)
// body of the method=> {}
public class Task3 {

     boolean isPrime(int num) {
          boolean isPrimeNum = false;
         int count = 0;


         for (int i = 0; i <= num; i++) {
             if (num % 2 == 0) {
                 isPrimeNum = true;
             }else{
                 isPrimeNum=false;
             }count++;
         }
         return isPrimeNum;
     }

     public static void main(String[] args) {
         Task3 task3 = new Task3();
         boolean isPrime = task3.isPrime(55);
         System.out.println(isPrime);


     }

}




