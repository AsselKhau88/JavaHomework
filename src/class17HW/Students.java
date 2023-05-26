package class17HW;

public class Students {
     /*
     Write a java Class Students that have a constructor which takes
     students name and 3 subject grades.
     Inside your class also have a method to Calculate Average Grade.
     Test Student class for 5 different students with different marks.
     Your program should print an average mark of each student's name.
     */

    String name;
    int mathGrade;
    int biologyGrade;
    int geometryGrade;

    Students(String name, int mathGrade, int biologyGrade, int geometryGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.biologyGrade = biologyGrade;
        this.geometryGrade = geometryGrade;
    }

    void averageGrade() {

        System.out.println("Student " + name + " has an average grade of " + (mathGrade + biologyGrade + geometryGrade) / 2);
    }

}



