package class14;

public class E1Methods {

        void printWord(String word) {
            System.out.println(word);
        }
        /*
        void=> return type of the method. Void means this method does not return any data
        and other examples of return types can be String int boolean Char Dog Cat etc.

        printWord=>it's the name of the method
        (String word) => parameters/inputs. You can pass anything as parameters(int,String,char..etc
        {System.out.println(word);} =>body of the method you can write if else conditions, loop
         */

    public static void main(String[] args) {
        // we are creating an object of the E1Method class
        //in Java all the class can be treated as data types
        /*
        E1Methods is data type,
        obj is name of date type,
        new E1Methods() this creates the object of the E1Methods class
         */
        E1Methods obj=new E1Methods();

        // we are calling the printWord() method on obj object and passing "java" as
        //argument or input
        obj.printWord("Java");
      }
    }

