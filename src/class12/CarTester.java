package class12;

public class CarTester {
    public static void main(String[] args) {
        //below code will create an object of car class
        Car car=new Car();
        car.model="Sienna";
        car.mileage=56984;
        car.color="Gray";
        car.type="minivan";
        car.doors=4;
        car.isAutomatic=true;

        car.startCar();
        car.turn();
        car.stopCar();

        Car car1=new Car();
        car1.model="Lamborghini";
        car1.mileage=0;
        car1.color="Red";
        car1.type="sport";
        car1.doors=2;
        car.isAutomatic=true;
         car1.startCar();
         car1.stopCar();



    }
}
