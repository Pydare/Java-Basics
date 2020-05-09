
abstract class Caravan {
    private double price;
    private String model;
    private String year;
    public abstract void goFast();
    public abstract int changeColor(); //abstract method
}
class SubCaravan extends Caravan{
    public int change = 1000;
    public void goFast(){
        System.out.println("I told him to go fast");
    }
    public int changeColor(){
        return change;
    }
    public static void main(String[] args){
        SubCaravan car = new SubCaravan();
        car.goFast();
        int ch = car.changeColor();
        System.out.println(ch);
    }
}