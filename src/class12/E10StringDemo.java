package class12;

public class E10StringDemo {
    public static void main(String[] args) {
        String name = "Leandror";
        System.out.println(name.charAt(1));
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

            System.out.println("------------------");


            //count how many times the letter r has appeared
            int counter = 0;
             for (int j = 0; j< name.length(); j++) {
            if (name.charAt(j) == ('r')) {
                counter++;
         }

        }
        System.out.println(counter);
         }
}

