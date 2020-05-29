package oop.overriding;

class Animal{
    public void move(){
        System.out.println("Animals can move");
    }
}
class Dog extends Animal{
    public void move(){
        super.move(); //invokes the super class method
        System.out.println("Dogs can walk and run");
    }
}
public class TestDog {
    public static void main(String args[]){
        Animal b = new Dog(); //animal reference but dog object
        b.move(); //runs the mehtod in Dog class
    }
}