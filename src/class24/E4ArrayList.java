package class24;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        //Integer integer=new Integer(10);//convert the primitives to a wrapper type this is called boxing
       Integer integer1=10; //convert the primitives to a wrapper type this is called autoboxing
        int num=integer1.intValue(); //unboxing
        int num2=integer1; // auto unboxing

        int num0= 10;
        int num1 = 20;
        ArrayList<Integer> numbers = new ArrayList<>();
        // datatype is being converted automatically from int to Integer (auto boxing)
        numbers.add(num0);
        numbers.add(num1);
        // datatype is being converted automatically from Integer to int (auto Unboxing)
        int number3 = numbers.get(0);

    }
}

