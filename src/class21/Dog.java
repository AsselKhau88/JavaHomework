package class21;

class Animal{
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }

    void speak(){
    System.out.println("Animals speak");}

    void sleep(){
        System.out.println("Animals sleep from 1 to 20 hours a day");}

    void eat(){
        System.out.println("Animal eat many different things");}

    }


   class Cat extends Animal {
    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
        void speak(){
        System.out.println("Meow");
    }
    @Override
       void eat(){
        System.out.println("Cats like to eat fish");
    }@Override
       void sleep(){
       System.out.println("Cats like tgo sleep 15 hours on Average");
   }
   }


   public class Dog extends Animal {

    public Dog(String name, String color, String breed) {
        super(name,color,breed);
    }
    @Override
    void speak(){
        System.out.println("woof");
    }
    @Override
    void sleep(){
        System.out.println("Dogs sleep 8 hours");
    }
    @Override
    void eat(){
        System.out.println("Dogs like to chew on bones");
    }
    void run(){
        System.out.println("Dogs runs fast");
    }

}
    class Horse extends Animal{
    public Horse(String name, String color, String breed) {
        super(name,color,breed);
     }
    @Override
    void speak(){
    System.out.println("neigh");
    }
    @Override
    void sleep(){
        System.out.println("Horses like to sleep 2-3 hours");
    }
    @Override
    void eat(){
        System.out.println("Horses like to eat carrot and grass");
    }
}

   class AnimalTester{



    public static void main(String[] args) {
        Dog dog = new Dog("Barsik", "black", "German");
        dog.printInfo();

        //Parent class var can store the objects of the child classes
        Animal dog1 = new Dog("Barsik", "black", "German");
        dog1.printInfo();


        // we also can store arrays
        Animal[] animals = {new Dog("Barsik", "black", "German"),
                            new Cat("Tom", "grey", "Persian")
                           };

        for (Animal animal : animals) {
            animal.printInfo();
        }
        //type casting(widening)
        double d=10;
        Animal dog2=new Dog("Jimmy","brown","German");

        int g=(int)10.5;
        //Dog dog3=new Animal("shaggy","white","Kavkaz"); cannot narrowing

    }
}

