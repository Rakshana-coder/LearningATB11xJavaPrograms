package ex_20_Polymorphism._MethodOverriding;

public class Lab165_MethodOverriding {
    public static void main(String[] args) {

        Dog d1  = new Dog();
        d1.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal Sound!");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark!");
    }
}

