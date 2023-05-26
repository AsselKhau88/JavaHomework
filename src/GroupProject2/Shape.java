package GroupProject2;
/*
Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimeter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code
 */

public interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
 class Circle implements Shape{

    private double radius;
     public Circle(double radius) {
         this.radius = radius;

     }

         @Override
     public double  calculateArea() {
             System.out.println("Area os circle is: "+Math.PI*radius*radius);
         return Math.PI*radius*radius;


     }
     public double calculatePerimeter() {
         System.out.println("Area os circle is: "+ 2*Math.PI*radius);
         return 2*Math.PI*radius;

     }
}

 class Square implements Shape {
     private double length;
     private double width;

     public Square(double length, double width) {
         this.length = length;
         this.width = width;
     }

         @Override
         public double calculateArea () {
             System.out.println("Area os square is: "+(length*width));
             return length*width;
         }

         @Override
         public double calculatePerimeter () {
             System.out.println("Perimeter of square is: "+2*(length*width));
             return 2 * (length + width);
         }
     }

