package project2;

public class task10 {
    public static void main(String[] args) {
          /*
        Write a program to print out duplicate elements from
        an Array of Strings?
         */
        String[] elements = {"Hi", "Bye", "Hello", "Good", "Hi"};
        int dublicates = 0;
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i].equals(elements[j])) {
                    dublicates++;
                    System.out.println("Duplicate string: " + elements[i]);
                }
            }
        }
    }
}