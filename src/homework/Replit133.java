package homework;

public class Replit133 {

        static int countA (String s){
            int counter=0;
            for(int i=0; i<s.length(); i++){
                if(s.equals("a")||s.equals("A")){
                    System.out.println(s.charAt(i));

                }
            }return counter;
        }

        {

        }

        //test case below (don't change):
        public static void main(String[] args){
            System.out.println(countA("aaA")); //3
            System.out.println(countA("aaBBdf8k3AAadnklA")); //6
        }
    }
