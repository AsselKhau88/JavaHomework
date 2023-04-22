package class10;

public class HW5 {
    public static void main(String[] args) {
        /*
        Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
        Then print all values from that array using 2 different loops and calculate how many total countries been stored.
         */
        String[][] countries = {
                {"USA", "Canada", "Mexico"},
                {"Argentina", "Chile", "Peru"},
                {"Paris", "German", "UK"},
                {"China", "Thailand", "Iran"},
                {"Kongo", "Egypt", "Mali"}
        };
        int counter = 0;
        for (String[] country : countries) {
            for (String total : country) {
                counter++;
            }
        }
        System.out.println(counter);


        System.out.println();
        int all = 0;
        for (int row = 0; row < countries.length; row++) {
            for (int col = 0; col < countries[row].length; col++) {
                all++;
            }
        }
        System.out.println(all);


        System.out.println();

        int count = 0;
        for (int row = 0; row < 5; row++) {
            count += countries[row].length;
        }
        System.out.println(count);
    }
}

