interface animal{
    public void sleep();
    public void sound()  ;
}

 class Dog implements animal{


    public void sleep() {
        System.out.println("śpi");
    }
    public void sound(){
        System.out.println("hał hał");
    }
}
class Cat implements animal{

    public void sleep() {
        System.out.println("śpi");
    }

    public void sound() {
        System.out.println("maiłmiał");
    }
}






public class Main {
    public static void main(String[] args) {

        Dog dog= new Dog();
        Cat cat= new Cat();
        cat.sleep();
        cat.sound();
        dog.sleep();
        dog.sound();


        }
    }
