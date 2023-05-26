package class17;

public class Cat {

      String name;
      Cat(String catName) {
         name = catName;
          System.out.println("1 argument constructor called");
          }
      Cat(String name, String color){
           System.out.println("2 argument constructor called ");
          }


         /*
           Cat(String color){
           System.out.println("1 argument constructor called");
            }
          */

    Cat(double weight){
        System.out.println("double constructor argument");
    }
    Cat(){
        System.out.println("0 argument constructor called");
    }


void printInfo(){
    System.out.println(name);
}


}
