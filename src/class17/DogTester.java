package class17;

public class DogTester {

      /* create 5 objects of a dog class provide initial values and for each
    object call the printInfo method
    */

    public static void main(String[] args) {
     /*
        Dog dog=new Dog();
        dog.name = "Tom";
        dog.color = "red";
        dog.breed = "BullDog";
        dog.age = 10;


        Dog dog1 = new Dog();
        dog1.name = "Pho";
        dog1.color = "green";
        dog1.breed = "Pitt-bull";
        dog1.age = 1;

        Dog dog2 = new Dog();
        dog2.name = "Timmy";
        dog2.color = "brown";
        dog2.breed = "Asian";
        dog2.age = 9;


        Dog dog3 = new Dog();
        dog3.name = "Oreo";
        dog3.color = "White";
        dog3.breed = "Persian";
        dog3.age = 8;


        Dog dog4 = new Dog();
        dog4.name = "Manny";
        dog4.color = "Grey";
        dog4.breed = "Huskey";
        dog4.age = 15;

        dog.printInfo();
        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();

        Below code will create the object of the dog class
        new Dog("jack","black","Persian", 12)
        new Dog()
     */


        Dog dog1=new Dog("Jack"," black","persian",12 );
        Dog dog2=new Dog("Oreo"," white","Asian",1 );
        Dog dog3=new Dog("Jimmy"," grey","Bulldog",10 );
        Dog dog4=new Dog("Jane"," red","British",5 );
        Dog dog5=new Dog("Hash"," brown","Huskey",9 );

        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog5.printInfo();


    }
}