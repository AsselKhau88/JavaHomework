package class20HW;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(4.5,68000.55);
        creditCard.method();
        Visa visa=new Visa(3,68425.22);
        AX ax=new AX(6,587496.23);
        ax.method();


    }
}
