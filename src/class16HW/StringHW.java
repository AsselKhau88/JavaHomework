package class16HW;

public class StringHW {
    /*
     Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */

    public String reverse(String name){
        String s="";
        for (int i = name.length(); i < name.length(); i--) {
            s=s+name.charAt(i);
        }
        return s;

    }

    public static void main(String[] args) {
        StringHW obj=new StringHW();
        obj.reverse("Assel");

    }
}
