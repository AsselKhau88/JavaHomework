package class18HW;

public class Teacher {
    /*
     Write a Java program called Teacher.
     Identify features and 4 behaviour of that Class. Create 3 subclasses MathTeacher,
     ChemistryTeacher and PianoTeacher .
     Test all 4 classes
     */

    String name;
    int age;


    void grade(){
        System.out.println("Mrs. "+name+" is grading homework");
    }
    void teach(){
            System.out.println("Teacher "+name+" is "+age+" years old and teaching kids some math");
    }
    void work(){
        System.out.println("Teacher "+name+" is cleaning a board");
    }
}
    class MathTeacher extends Teacher{

    }
    class ChemistryTeacher extends Teacher{

    }
    class PianoTeacher extends Teacher{

    }

