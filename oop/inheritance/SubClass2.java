package oop.inheritance;

class SuperClass2{
    int age;
    SuperClass2(int age){
        this.age = age;
    }
    public void getAge(){
        System.out.println("The value of the variable named age in super class is "+age);

    }
}
public class SubClass2 extends SuperClass2{
    SubClass2(int age){
        super(age);
    }

    public static void main(String[] args){
        SubClass2 s = new SubClass2(24);
        s.getAge();
    }
}