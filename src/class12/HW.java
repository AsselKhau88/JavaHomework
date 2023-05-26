package class12;

public class HW {
    public static void main(String[] args) {
        String name = "Adele";
        if(!name.isEmpty()&&name.length()%2!=0 && name.length()>=3 ){
            int middleIndex=name.length()/2;
            char middleChar=name.charAt(middleIndex);
            System.out.println(middleChar);

            }

        }
    }
