package class24;

import java.util.ArrayList;
import java.util.Iterator;

public class E9ArrayList {
    /*
    Create an arrayList of words.
    Remove every word that ends with “e”.
     */
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Bye");
        words.add("House");

        words.removeIf(word->word.endsWith("e"));

        //Iterator is an Interface
     /*   Iterator<String> iterator=words.iterator();

             while(iterator.hasNext()){
            String word=iterator.next();
            if(word.endsWith("e")){
            iterator.remove();
        }
        }
       */
        System.out.println(words);
    }


}
