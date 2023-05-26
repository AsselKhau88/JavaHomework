package class13;

public class HW4 {
    /*
    How would you reverse a String word by word? for ex:
    input=>This is sentence I want to reverse
    output=> sihT si ecnetnes I tnaw ot esrever
     */
    public static void main(String[] args) {
        String sentence="This is sentence I want to reverse";

        for (int i = sentence.length(); i >=0 ; i--) {
            sentence.charAt(i-1);
            System.out.println(sentence);

        }

    }



    }


