package class21;

public class Student {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define 3 common behavior within parent class and override some methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism
    */



    void study(){
        System.out.println("Students are studying");
    }

    void talk(){
        System.out.println("Students are talking");
    }

    void walk(){
        System.out.println("Students are walking");
    }

}


class SyntaxStudent extends Student{

    @Override
    void study(){
        System.out.println("Syntax Students are practicing Java");
    }
    @Override
    void talk(){
        System.out.println("Talking to Asghar and Soheil, Sumair, and Asel");
    }
    @Override
    void walk(){
        System.out.println("Walking to the room before class starts");
    }
    void type(){
        System.out.println("Typing in Macbook to participate");
    }
}



class CollegeStudent extends Student{
    @Override
    void study(){
        System.out.println("College Students are studying for the Math final exam");
    }
    @Override
    void talk(){
        System.out.println("Talking to the mates for help");
    }
    @Override
    void walk(){
        System.out.println("College Students walking to their dorms");
    }

}



class SchoolStudent extends Student{
    @Override
    void study(){
        System.out.println("School students are in Spanish class");
    }

    @Override
    void talk(){
        System.out.println("Talking to counselor for extra help");
    }
    @Override
    void walk(){
        System.out.println("School Students walking to the lunch room");
    }
//  Define some methods specific to child classes
    void fight(){
        System.out.println("Kids are fighting");
    }

}