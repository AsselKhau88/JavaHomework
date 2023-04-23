package class12;

public class E1StringDemo {
    public static void main(String[] args) {


        //create the object of that class
        //Scanner scan=new Scanner(System.in);
        //ClassName objectName = new ClassName();
        String string = new String("Ana");
        //shortcut
        String string1 = "Ana";// most widely used one
        System.out.println(string1.length()); //there are 3 letters in name Ana
        String name = "Justin Chukwudiuche";
        if (name.length() > 8) {
            System.out.println("Only 8 characters are allowed");
        }

    }
}
