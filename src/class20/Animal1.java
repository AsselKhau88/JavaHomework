package class20;

public class Animal1 {
/*
Create 3 animal classes(Dog,Cat,Horse) create 3 methods in each class. Create
3 fields and constructors as well in each class. Create the object of all 3 classes
and call 2 methods from each class. You must use inheritance to avoid code duplication
 */
    String name;
    String color;

    int age;

    Animal1(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

        void sleep(){
            System.out.println("ZZZZZZZ");
        }

        void eat(){
            System.out.println("nyam nyam");
        }
        void walk(){
            System.out.println("top-top");
        }
    }

class Dog extends Animal1 {
        public Dog(String name, String color, int age) {
        super(name, color, age);}


        void sleep(){
            System.out.println("I like to sleep for 10.6 hours a day");
        }
    }
    class Cat extends Animal1 {

        public Cat(String name, String color, int age) {
            super(name, color, age);
        }
    }
    class Horse extends Animal1 {
        public Horse(String name, String color, int age) {
            super(name, color, age);
        }
    }

