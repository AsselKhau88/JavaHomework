package class4;

import java.util.Scanner;

public class HM4 {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into Celsius and print “The temperature is
        the city  is ”
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter you city");
        String city= scan.next();
        System.out.println("Please enter temperature");
        double tempFahrenheit= scan.nextDouble();
         double tempCelsius= (tempFahrenheit - 32)/1.8;
        System.out.println("The temperature is "+ tempCelsius+ " the city is "+ city) ;




    }
}
