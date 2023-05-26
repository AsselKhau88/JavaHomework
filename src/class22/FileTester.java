package class22;

public class FileTester {
    public static void main(String[] args) {
        File[]files={new JavaFile("Fox",5),
                new WordFile("Rabbit",9),
                new PdfFile("Apple",45)};
        for(File file:files){
         file.printInfo();
         file.edit();
         file.open();
          file.close();
}
    }
}

