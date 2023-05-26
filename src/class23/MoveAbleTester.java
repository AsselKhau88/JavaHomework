package class23;

public class MoveAbleTester {
    public static void main(String[] args) {
        MoveAble moveAble=new Cat();
        MoveAble[] moveAbles={new Cat(),new Dog(),new Horse()};
        for(MoveAble m: moveAbles){
            m.move();
        }
        WashAble washAble=new Dog();
        WashAble[] washAbles={new Dog(), new Cat(), new Horse()};
        for(WashAble w:washAbles){
            w.wash();
        }

    }
}
