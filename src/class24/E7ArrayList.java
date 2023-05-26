package class24;

import java.util.ArrayList;

public class E7ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Alia");
        names.add("Axel");
        names.add("Adele");
        names.add("Vlad");
        names.add("Jane");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Adele"));
        System.out.println(names.size());
        System.out.println(names);

    }
}
