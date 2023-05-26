package class21;

public class Refresher1 {
    public static void main(String[] args) {
        Dog dog1=new Dog("Lal","white","Persian");
        Dog[]dogs={dog1,new Dog("Papi","white","chinese")};
        for(int i=0; i<dogs.length;i++){
            dogs[i].printInfo();

        //we can use enhanced loop also
        //for(Dog dog:dogs){
           // dog.printInfo();


        //not preferred way
             // Dog[]dogs={new Dog("Lal","white","Persian"),new Dog("Papi","white","chinese")};
            //Dog d=dogs[0];
           //d.printInfo();
        }

    }
}
