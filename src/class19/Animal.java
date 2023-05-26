package class19;

import class18.Horse;

public class Animal {
  /*
    Create 3 classes like Dog Cat Horse define 4 properties(use default
    access level).
    You can use inheritance to avoid code duplication.
    Create one printInfo method that will print the values of these variables.
    Create constructors as well in each child class to initialize those
    properties create one object of each class and call the printInfo method
  */
    String name;
    String color;
    String breed;
    int age;
    Animal(String name,String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
        void printInfo(){
        System.out.println(name+" "+color+" "+breed+" "+age);
           }

}
class Dog extends Animal{
    double price;
   public Dog(String name,String color, String breed, int age,double price){
       super(name,color,breed,age);
       this.price=price; //assigning the price
   }
   void printInfo(){
       super.printInfo(); // reusing the printInfo method from parent class by using super keyword
       System.out.println(price);
   }
}
class Cat extends Animal {
    public Cat(String name, String color, String breed, int age) {
        super(name, color, breed, age);
    }

    class Horse1 extends Animal {
        public Horse1(String name, String color, String breed, int age) {
            super(name, color, breed, age);
        }
    }
}
    class AnimalTester{
        public static void main(String[] args) {
            Dog dog=new Dog("Tom", "Black", "Persian", 5,2000);
            dog.printInfo();

        }
        }

