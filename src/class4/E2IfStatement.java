package class4;

public class E2IfStatement {
    public static void main(String[] args) {
        //String is non-primitive data type, and with non-primitive we can't use
        //relational Operators (like == sign)
        String name="Jacob";

        if(name.equals("Corey")) {
            System.out.println("I like swimming");
        }else{
            System.out.println("I like programming");
        }
    }
}
