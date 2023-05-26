package GroupProject2;

import java.util.Arrays;

public class Task4 {
    /*
    Check if Two Strings are Anagrams: Given two strings, determine if
    they are anagrams, meaning they contain the same characters in a
    different order. For example, "listen" and "silent" are anagrams
     */
    public static void main(String[] args) {

                String s="listen";
                String s1="silent";

                if (s.length() == s1.length()) {
            char[] charArray = s.toCharArray();
            char[] charArray1 = s1.toCharArray();

            Arrays.sort(charArray);
            Arrays.sort(charArray1);

            boolean result = Arrays.equals(charArray, charArray1);
            if (result) {
                System.out.print("The two strings are "
                        + "anagram of each other");
            } else {
                System.out.print("The two strings are "
                        + "not anagram of each other");
            }
        }

    }
}
