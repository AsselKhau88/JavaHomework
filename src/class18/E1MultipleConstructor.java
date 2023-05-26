package class18;

public class E1MultipleConstructor {
    public static void main(String[] args) {
        String str=new String("Java");
        char [] chars={'J','a','v','a'};
        String str1=new String(chars);
        //extract java and convert it to upper case
        char [] chars2={'t','h','e','J','a','v','a','I','A','e'};
String str3=new String(chars2,3,4);
//top line 3 means ignore first three letters and 4 means take only 4 letters after those 3
        System.out.println(str3.toUpperCase());


    }



}
