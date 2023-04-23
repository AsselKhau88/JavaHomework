package class12;

public class E10StringDemo {
    public static void main(String[] args) {
        String name = "Leandror";
        // System.out.println(name.charAt(1));
        //  for (int i = 0; i < name.length() ; i++) {
        //  System.out.println(name.charAt(i));
        //count how many times the letter r has appeared
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ('r')) {
                counter++;
            }

        }
        System.out.println(counter);

    }
}
