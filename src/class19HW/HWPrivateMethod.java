package class19HW;

public class HWPrivateMethod {
     /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe
    result.
     */

    private void add(int a, float b)
    {
        System.out.println(a+b);
    }

    private void add(short c, long d)
    {
        System.out.println(c+d);
    }
    private void add(double e, int f)
    {
        System.out.println(e+f);
    }

    public static void main(String[] args) {
        HWPrivateMethod hw=new HWPrivateMethod();
        hw.add(5,685412.2154F);
        hw.add(54,3695487241L);
        hw.add(10.5, 6);

    }

}
