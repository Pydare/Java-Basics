package lambda_expressions;

public class TypeInferenceExample {

    public static void main(String[] args) {
        StringLengthLambda myLamda = s -> s.length();
        System.out.println(myLamda.getLength("Hello World")); 
    }

    
    
    interface StringLengthLambda{
        int getLength(String s);
    }

}