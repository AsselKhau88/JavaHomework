package GroupProject2;

public class MarksTester {
    public static void main(String[] args) {
        Marks []marks={new A(98,68,88),
                       new B(99,58,75,100)};
        for( Marks obj:marks){
            obj.getPercentage();

        }
    }
}
