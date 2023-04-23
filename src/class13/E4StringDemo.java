package class13;

public class E4StringDemo {
    public static void main(String[] args) {
        String str="Today is Sunday. We have java class. We like java";
        String[] strArr=str.split("[.]");// "[.!?]" we can put whichever sign sentence ends with

        System.out.println(strArr.length);
        System.out.println(strArr[2].trim()); //we add .trim()to remove space in the beginning
    }
}
