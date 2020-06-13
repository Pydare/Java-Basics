package oop.polymorphism;

public class VirtualDemo {
    public static void main(String[] args){
        Salary s = new Salary("Mohd Mohtashim","Ambehta,UP",3,3600.00);
        Employee e = new Salary("John Adams","Boston,MA",2,2400.00);
        System.out.println("Call mailCheck using salary reference --");
        s.mailCheck();
        System.out.println("Call mailCheck using employee reference --");
        e.mailCheck();
    }

}