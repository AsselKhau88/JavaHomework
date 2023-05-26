package class17;

public class Laptop {
    String make;
    String model;
    double batteryLife;
    int storage;
    boolean camera;
    boolean touchScreen;

    public Laptop(String make, String model, double batteryLife, int storage, boolean camera, boolean touchScreen) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.camera = camera;
        this.touchScreen = touchScreen;
    }

    public static void main(String[] args) {
        Laptop dellG5=new Laptop("Dell", "G5", 3,512,true, false);
    }
}
