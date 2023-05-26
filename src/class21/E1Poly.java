package class21;

public class E1Poly {
    public static void main(String[] args) {

        Animal[] animals = {new Dog("Puffer", "grey", "Bulldog"),
                            new Cat("Jack", "black", "German"),
                            new Horse("Barsik", "white", "Italian")
        };

        for(Animal animal:animals){
            animal.speak();
            animal.eat();
            animal.sleep();
        }
        Animal animal=new Dog("Puffer", "grey", "Bulldog");
        //we must type cast the dogStoredInAnimal back to a dog to call the run method
        //as this run method only exits in the Dog class.
        Dog d=(Dog)animal;
        d.run();
        // direct way without using a variable
        // ((Dog)dogStoredInAnimal).run(); ((Dog)animal).run();

        //typecasting    int num = (int) 10.5;

    }
}
