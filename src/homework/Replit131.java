package homework;

public class Replit131 {
    static String thirdLetter(String s){
String a="";
        for(int i=0; i<s.length(); i++){
            if(i%3==0){
                System.out.print(s.charAt(i));
            }

        }
        return a;

    }
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}



