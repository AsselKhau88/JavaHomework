package class22;


    /*
    create 3 animals like Dog, Cat, and Horse
    define 3 common methods in each class like speak, eat, and sleep.
    create the object of all the classes and call the methods
     */
    public abstract class Animal {
        private String name;
        private String color;
       final private String breed;
        Animal( String name,String color,String breed){
            this.name=name;
            this.color=color;
            this.breed=breed;
        }

        abstract void speak();

        abstract void sleep();

        abstract void eat();
        void printInfo(){
            System.out.println(name+" "+color+" "+breed);
        }

}
class Cat extends Animal {
        Cat(String name,String color,String breed){
            super(name,color,breed);
        }
    @Override
    void speak(){
        System.out.println("Meow");
    }
    @Override void eat(){
        System.out.println("Cats like to eat fish");
    }@Override
    void sleep(){
        System.out.println("Cats like to sleep 15 hours on Average");
    }
}
class Dog extends Animal {
    Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

        @Override
        void speak () {
            System.out.println("woof");
        }

        @Override
        void sleep () {
            System.out.println("Dogs sleep 8 hours");
        }

        @Override
        void eat () {
            System.out.println("Dogs like to chew on bones");
        }
    }

    class Horse extends Animal {
        Horse(String name, String color, String breed) {
            super(name, color, breed);
        }

        @Override
        void speak() {
            System.out.println("neigh");
        }

        @Override
        void sleep() {
            System.out.println("Horses like to sleep 2-3 hours");
        }

        @Override
        void eat() {
            System.out.println("Horses like to eat carrot and grass");
        }
    }

