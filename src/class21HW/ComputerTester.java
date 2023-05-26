package class21HW;

public class ComputerTester {
    public static void main(String[] args) {
        Computer [] comp= {new Apple("proMac", 2015),
                new Lenovo("Summer",1998),
                new HP("Spring",2009),
                new Dell("Winter",1990) };
       for(Computer comp1:comp){
           comp1.systemRun();
           comp1.perform();


       }




    }

}
