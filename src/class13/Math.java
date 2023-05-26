package class13;

public class Math{
    // math is a class
    //add and multiply are names of method
    void add(int num1, int num2){
        System.out.println(num1+num2);
    }


    public static void main(String[] args) {
        Math math=new Math();
        math.add(10,10);
        math.multiply(5,5);
    }
void multiply(int num3, int num4){
    System.out.println(num3*num4);
}

}











