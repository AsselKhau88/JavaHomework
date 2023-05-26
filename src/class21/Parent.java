package class21;

public class Parent {
  final int noOfMonthsInYear=12; //final keyword seals the variable and the value of variable which means no one cannot change it
   final void getMarry(){
        System.out.println("Marry Shakiaa");
      // noOfMonthsInYear=15; cannot do that because final is in parent class
    }
    void study(){
        System.out.println("Study Medicine");
    }
    class Axel extends Parent{
        @Override
        void study(){
            System.out.println("No I want SDET");
        }
    }
}
