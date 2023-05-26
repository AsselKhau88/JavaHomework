package class18HW;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.name="Doe";
        teacher.age=55;
        teacher.grade();

        MathTeacher obj=new MathTeacher();
        obj.age=26;
        obj.name="Graham";
        obj.teach();

        ChemistryTeacher obj1=new ChemistryTeacher();
        obj1.name="Petko";
        obj1.age=35;
        obj1.work();

        PianoTeacher obj2=new PianoTeacher();
        obj2.name="Penn";
        obj2.age=55;
        obj2.teach();
    }

}
