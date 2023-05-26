package GroupProject2;
/*
   Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 subclasses: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount

    */
public class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

     double calculateSalePrice(){
        return carPrice;
     }

    }

    class Sedan extends Car{
        double length;

        public Sedan(double carPrice, String color, double length) {
            super(carPrice, color);
            this.length = length;
        }
@Override
        double calculateSalePrice() {
            if(length>20){
               double discount=carPrice*0.05;
                carPrice=carPrice-discount;
                return carPrice;
            }else{
            double discount=carPrice*0.2;
            carPrice=carPrice-discount;
            return carPrice;
            }

        }
    }
class Truck extends Car{
     double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }
    @Override
        double calculateSalePrice(){
            if(weight>2000){
                double discount=carPrice*0.1;
                carPrice=carPrice-discount;
                return carPrice;
            }else{
                double discount=carPrice*0.2;
                carPrice=carPrice-discount;
                return carPrice;

        }
    }
}
