package class13;

public class E3StringDemo {
    public static void main(String[] args) {
       String str="ks  fksnGFSHGF   HGVC46  517892@#!$%^&*()";
        //System.out.println(str.replaceAll("[^a-z]",""));
        //do not replace lower case letters from a-z and numbers from 0-9
       //System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));

       // System.out.println(str.replaceAll("[Hs2]",""));
        //System.out.println(str.replaceAll("[A-Z]","\\$"));
        System.out.println(str.replaceAll(" ","\\$")); //we can replace spaces too
        //String str="ksnfksnGFSHGFHGVC 46517892@#     !$%^&*()";
    }
}
