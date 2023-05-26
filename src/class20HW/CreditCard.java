package class20HW;

import java.util.concurrent.Callable;

public class CreditCard {
    /*
       Create a class CreditCard and define variable balance and interest.
       Create an instance method that will calculate interest based on the given balance.
       Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
       Call the method by creating an object of each of the three classes.
    */

    double balance;
    double interest;

    CreditCard(double interest, double balance){
        this.interest=interest;
        this.balance=balance;
    }
    void method () {
        System.out.println((balance*interest)/24);
    }
}
   class Visa extends CreditCard {
       Visa(double interest, double balance) {
           super(interest, balance);
       }
   }

       class AX extends CreditCard {
           AX(double interest, double balance) {
               super(interest, balance);
           }
           @Override
           void method() {
               System.out.println((balance * interest) / 12);
           }

       }

