package knowledge;

public class VarargsDemo {
    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("No arguments passed");
            return;
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > result) result = numbers[i];
        }
        System.out.println("The max value is " + result);
    }

    public static void main(String[] args){

        //call method with variable args
        printMax(34,3,2,56);

    }

}