package class17HW;

public class StudentsTester {
    public static void main(String[] args) {
        Students student = new Students("Jack", 101, 88, 90);
        student.averageGrade();

        Students student1 = new Students("Assel", 66, 98, 88);
        student1.averageGrade();

        Students student2 = new Students("Adele", 55, 70, 140);
        student2.averageGrade();

        Students student3 = new Students("Oksana", 60, 102, 66);
        student3.averageGrade();

        Students student4 = new Students("Jill", 66, 98, 101);
        student4.averageGrade();
    }
}