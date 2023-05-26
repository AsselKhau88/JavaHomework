package class15;

public class E7SyntaxEmployee {
 /*   Create a Class called SyntaxEmployee:
      Create three  variables  empID , salary and set the CEO to “Sumair”
      Create two objects of the class SyntaxEmployee
      Set the value of empID, salary for each of the objects
      Print out the empID , salary and  CEO for each of the objects
 */
 String empId; //instance variable (because there are can be 1000-1000000 employees, and it can never be same
 double salary;
static String CEO = "Sumair"; //we use Static because it never changes

 public static void main(String[] args) {
  E7SyntaxEmployee e7syntaxemployee= new E7SyntaxEmployee();
  e7syntaxemployee.empId = "123456";
  e7syntaxemployee.salary = 90000;
  System.out.println( e7syntaxemployee.empId);
  System.out.println( e7syntaxemployee.salary);
  //System.out.println(e7syntaxemployee.CEO);// not the preferred way
  System.out.println(E7SyntaxEmployee.CEO);// 99.99 this is how they are used

  E7SyntaxEmployee sohail = new E7SyntaxEmployee();
  sohail.empId = "584685";
  sohail.salary = 92000;
  System.out.println(sohail.empId);
  System.out.println(sohail.salary);
  System.out.println(sohail.CEO);
 }
}