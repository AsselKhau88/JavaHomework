package class21HW;

import class21.Parent;

/*
  Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
  Define common behavior and some fields within parent class and
  override some the methods in child classes
  Define some methods specific to child classes
  Create objects of child classes and store them into array.
  Loop through each object and execute available methods.
  */
public class Computer {
    String model;
    int yearManufactured;

    void systemRun() {
        System.out.println("System is running");
    }
    void perform(){
        System.out.println("Performing tasks ");
    }
    Computer(String model, int yearManufactured){
        this.model=model;
        this.yearManufactured=yearManufactured;
    }

}


class Apple extends Computer {
    Apple(String model, int yearManufactured) {
        super(model, yearManufactured);
    }

    void systemRun() {
        System.out.println("Apple's system runs fast");
    }

    void perform() {
        System.out.println("Apple computer is performing tasks with success ");
    }

    void faceRecognition() {
        System.out.println("Apple unlock computer with face recognition function");
    }
}



class Lenovo extends Computer {
        Lenovo(String model, int yearManufactured) {
            super(model, yearManufactured);
        }

        void systemRun() {
            System.out.println("Lenovo system runs slow");
        }

        void perform() {
            System.out.println("Lenovo computer is performing tasks without problem ");
        }

        void type() {
            System.out.println("Lenovo type casting is on");
        }
    }



    class HP extends Computer {
        HP(String model, int yearManufactured) {
            super(model, yearManufactured);
        }

        void systemRun() {
            System.out.println("HP system runs effectively");
        }

        void perform() {
            System.out.println("HP computer is performing tasks with success ");
        }

        void faceId() {
            System.out.println("Identify user by face Id");
        }
    }



    class Dell extends Computer {
        Dell(String model, int yearManufactured) {
            super(model, yearManufactured);
        }

        void systemRun() {
            System.out.println("Dell system runs quiet fast");
        }

        void perform() {
            System.out.println("Dell computer is performing tasks with some issues ");
        }

    }
