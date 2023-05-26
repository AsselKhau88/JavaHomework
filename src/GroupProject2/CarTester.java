package GroupProject2;

public class CarTester {
    public static void main(String[] args) {
        Sedan sedan=new Sedan(35000, "black",14.7);
        Truck truck=new Truck(48000,"white",4000);

        System.out.println(sedan.calculateSalePrice());
        System.out.println(truck.calculateSalePrice());
    }
}
