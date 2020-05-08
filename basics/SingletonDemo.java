package basics;

public class SingletonDemo {
    public static void main(String[] args){
        Singleton temp = Singleton.getInstance();
        temp.demoMethod();
    }
}