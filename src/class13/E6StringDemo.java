package class13;

public class E6StringDemo {
    public static void main(String[] args) {
        String str="Wife";
        str.toLowerCase(); // immutable, cannot change
        System.out.println(str);

        StringBuilder str2=new StringBuilder("Husband");
        str2.reverse();//mutable, it can change
        System.out.println(str2);
    }
}
