package class21;

public class StudentTester {
    public static void main(String[] args) {
        Student student1 [] = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for (Student student : student1) {

            if (student instanceof SyntaxStudent) {
                ((SyntaxStudent) student).type();
            } else if (student instanceof SchoolStudent) {
                ((SchoolStudent) student).fight();
            }
            student.study();
            student.talk();
            student.walk();
        }

        Student syntax = new SchoolStudent();
        if (syntax instanceof SyntaxStudent) {
            ((SyntaxStudent) syntax).type();
        } else {
            System.out.println("Wrong type of object is present in syntax var casting will fail");
        }


        Student school = new SchoolStudent();
        ((SchoolStudent) school).fight();


    }
}
// Animal animal =new Cat("Tom", "Blue,"Persian");
// if(animal instanceof Cat){
//     System.out.println("yeap...")
// }else{
// System.out.println("noooo..") }

