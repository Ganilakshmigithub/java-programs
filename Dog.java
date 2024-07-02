 class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}

public class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking");
    }
}
class Main{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}