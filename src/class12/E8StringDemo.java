package class12;

public class E8StringDemo {

    public static void main(String[] args) {
        //if the sentence start with "Java"
        String sentence="   JAVA is very very hard"; //if there is even a space than result will be false
        //java is very sensitive
        sentence=sentence.trim().toLowerCase(); //method chaining and it is possible in String class
        System.out.println(sentence);


        String searchWord="Java";
        System.out.println(sentence.startsWith("java"));



    }
}
