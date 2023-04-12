package class6;

public class E5SwitchStatement {
    public static void main(String[] args) {

        char gender='F';
        switch(gender){
            case 'F':
                System.out.println("Famale");
                break;
            case'M':
                System.out.println("Male");
                break;
            case'0':
                System.out.println("Others");
                break;
            default:
                System.out.println("Char not supported");
        }
}
}
