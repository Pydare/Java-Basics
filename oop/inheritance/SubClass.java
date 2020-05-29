package oop.inheritance;

class SuperClass{
    int num = 20;

    //display method of superclass
    public void display(){
        System.out.println("This is the display method of superclass");
    }
}

public class SubClass extends SuperClass {
    int num = 10;

    //display method of sub class
    public void display(){
        System.out.println("This is the display method of subclass");
    }
    public void myMethod(){
        //instantiating subclass
        SubClass sub = new SubClass();

        //invoking the display() method of sub class
        sub.display();

        //invoking the display() method of super class
        super.display();

        //printing the value of variable num of subclass
        System.out.println("The value of the variable named num in subclass: "+sub.num);

        //printing the value of variable num of super class
        System.out.println("The value of the variable named num in superclass: "+super.num);


    }

    public static void main(String[] args){
        SubClass obj = new SubClass();
        obj.myMethod();
    }
}