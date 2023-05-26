package class24;

import java.util.ArrayList;

public class E8ArrayList {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Hello");
        words.add("Bye");
        words.add("House");

       /*  for (String word:words){
            if(word.endsWith("e")){
                names.remove(word);
            }
        }
*/
        for (int i = 0; i < words.size(); i++) {
            String word=words.get(i);
            if(word.endsWith("e")){
                words.remove(i);
                i--;
            }
        }
        System.out.println(words);
    }
}
