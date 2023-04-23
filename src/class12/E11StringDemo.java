package class12;

public class E11StringDemo {
    public static void main(String[] args) {
        //String name="Today is Saturday";
       // System.out.println(name.indexOf('i'));
       // System.out.println(name.indexOf('a'));
        // start searching from index 4
       // System.out.println(name.indexOf('a',4));
        String name="Today is Saturday";
        for (int i = 0; i <name.length(); i++) {
            if(name.charAt(i)=='a'){
                System.out.print(i+" ");
               // System.out.println(name.charAt(i));
            }
        }
    }
}
