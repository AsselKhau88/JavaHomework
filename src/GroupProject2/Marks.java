package GroupProject2;

public abstract class Marks {
    /*
    We have to calculate the average of grades obtained in three subjects
   by student A and by student B. Create class 'Marks' with an abstract
   method 'getPercentage' that will be returning the average percentage
   of grades. Provide implementation of abstract method in classes 'A'
   and 'B'. The constructor of student A takes the grades in three
   subjects as its parameters and the grades in four subjects as its
   parameters for student B. Test your code
   */

    abstract int getPercentage();
}
class A extends Marks{
    int math;
    int history;
    int biology;

    A( int math, int history, int biology){
        this.math=math;
        this.history=history;
        this.biology=biology;
    }

    int getPercentage(){
        System.out.println("Average percentage is: "+(math+history+biology)/3);
        return (math+history+biology)/3;
    }

}
class B extends Marks{
    int math;
    int history;
    int biology;
    int science;


    B(int math, int history, int biology, int science){
    this.math=math;
    this.history=history;
    this.biology=biology;
    this.science=science;
    }
    int getPercentage(){
        System.out.println("Average percentage is: "+(math+history+biology+science)/4);
        return (math+history+biology)/4;
    }

}

