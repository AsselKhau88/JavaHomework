package class13;

import org.w3c.dom.ls.LSOutput;

public class HW3 {
    /*
    Create a String that will hold a sentence.
    Write a program to get a new String without any spaces.
    */
    public static void main(String[] args) {
        String sentence="I am happy!";
        System.out.println(sentence.replaceAll(" ", ""));

    }
}
