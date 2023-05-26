package class23;

public interface MoveAble {
    // public static final int age;
    int age=12;
     void move();
}
//class can implement as many interfaces as it wants

interface WashAble extends MoveAble{
    void wash();
}

class Dog implements MoveAble,WashAble{
    @Override
    public void move() {
        System.out.println("Dog can move also....");
    }
    @Override
    public void wash() {
        System.out.println("You can wash me....");
    }
}
class Cat implements MoveAble,WashAble{
    @Override
    public void move() {
        System.out.println("Cats can also move");
    }

    @Override
    public void wash() {
        System.out.println("Please wash me....");
    }
}
//although we could implement a method in Horse class
// it won't work unless we put class Horse implements MoveAble
/*
class Horse{
    public void move(){
        System.out.println("Cats can also move");
    }}
*/

class Horse implements MoveAble, WashAble{
    public void move(){
        System.out.println("Horses can move fast");
    }

    @Override
    public void wash() {
        System.out.println("Wash me with brush....");
    }
}