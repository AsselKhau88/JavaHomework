package class17HW;

public class HW1 {
     /*
    Write a java class that have 4 constructors with
    4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class:
    1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package and observe result.
    */

    int age;
    String name;

    HW1(){
    }

    public HW1(String name){
        this.name=name;
        System.out.println("My name is "+name);
    }
    private HW1(int age, String name){
        this.age=age;
        this.name=name;
        System.out.println("She is "+age+" years old and her name is"+name);

    }
    protected HW1(int age){
        this.age=age;
        System.out.println("I am "+age+" years old");
    }

    public static void main(String[] args) {
        HW1 obj = new HW1("Jane");
        HW1 obj1 = new HW1(35, " Jane");
        HW1 obj2 = new HW1(35);
        HW1 obj3 = new HW1();

    }}
      /*
      package class17;

      import class17HW.HW1;

      public class HW1ObserveResults {

       public static void main(String[] args) {
        HW1 obj = new HW1("Jane"); //we could call only one public

        HW1 obj1 = new HW1(35, " Jane"); //cannot call private
        HW1 obj2 = new HW1(35); //cannot call protected
        HW1 obj3 = new HW1();  //cannot call default
          }
          }
       */
