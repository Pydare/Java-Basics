package lambda_expressions;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String [] args){
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        Greeting myLambdaFunction = () -> System.out.print("Hello World");

        //creating an anonymous inner class
        Greeting innerClassGreeting = new Greeting(){
            public void perform(){ System.out.println("Hello World");}
        };

        greeter.greet(myLambdaFunction);
        greeter.greet(innerClassGreeting);
    }


}


