package class22;
   /*
   Create a class File that will have the following behaviors: open, edit, close
   and fields like name and size.
   Edit and close are implemented method while open is an abstract.
   Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide
   specific implementation of open behaviour:
   Example: to open .java file we need notepad++ or sublime text,
   to open .doc file we need Microsoft word to be installed etc.
   */
   abstract public class File {
       private String name;
       private int size;

       File(String name, int size) {
           this.name = name;
           this.size = size;
       }

       void printInfo() {
           System.out.println(name + " " + size);
       }

       abstract void open();

       void edit() {
           System.out.println("Editing...");
       }

       void close() {
           System.out.println("Closing....");
       }
   }

   class JavaFile extends File{
      public JavaFile(String name, int size) {
           super(name, size);
       }
       @Override
       void open(){
           System.out.println("to open .java file we need Intellij");
       }

       @Override
       void edit(){
           System.out.println("Edit in progress");
       }

       @Override
       void close(){
           System.out.println("Closing the programm");
       }
   }

   class WordFile extends File{
    WordFile(String name, int size){
        super(name,size);}

       @Override
       void open(){
           System.out.println("to open .java file we need sublime text");
       }

    @Override
    void edit(){
        System.out.println("Edition with parameters");
    }

    @Override
    void close(){
        System.out.println("Closing file");
    }

}


    class PdfFile extends File{
    PdfFile(String name, int size){
        super(name,size);
    }
    @Override
    void open(){
        System.out.println("open .doc file we need Microsoft word to be installed");
    }

    @Override
    void edit(){
        System.out.println("Edit with issues");
    }

    @Override
    void close(){
        System.out.println("Not closing");
    }

}

