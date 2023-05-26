package GroupProject2;

public class Task5 {
    public static void main(String[] args) {
        String s ="abracadabra";

        for(char i :s.toCharArray()){
            if ( s.indexOf(i) ==s.lastIndexOf(i)) {
                System.out.println("First non-repeating character is :" + i);
                break;
            }
        }
    }
}
