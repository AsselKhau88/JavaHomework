package class22;

public class AnimalTester {

    public static void main(String[] args) {

        Animal[]animals={new Cat("Murka","grey","American"),
                new Dog("Jack","Black","German"),
                new Horse("Bob","brown","Irish")};
        for(Animal obj:animals){
        obj.eat();
        obj.speak();
        obj.sleep();
    }
   }
}
