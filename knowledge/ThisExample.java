package knowledge;

public class ThisExample {
    //instance variable num
    int num = 10;

    ThisExample(){
        System.out.println("This is an example program on keyword this ");
    }

    ThisExample(int num){
        //invoking the default constructor
        this();
        //assigning the local variable num to the instance variable num
        this.num = num;
    }

    public static void greet(){
        System.out.println("Hi Welcome here");
    }

    public void print(){
        //local variable num
        int num = 20;

        //printing out the local variable
        System.out.println("Value of local variable num is "+num);

        //printing out the instance variable
        System.out.println("Value of instance variable num is "+this.num);

        //invoking the greet method of a class
        greet();
    }

    public static void main(String[] args){
        //instantiating the class
        ThisExample obj1 = new ThisExample();

        //invoking the print method
        obj1.print();
        
        //passing a new value to the num variable through parametrized constructor
        ThisExample obj2 = new ThisExample(30);
        
        //invoking print method again
        obj2.print();
    }

}