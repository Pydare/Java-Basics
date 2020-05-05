

public class Singleton{
    private static Singleton singleton = new Singleton();

    /*A private constructor prevents any other class from instantiating*/
    private Singleton(){}

    /* Static instance method */
    public static Singleton getInstance(){
        return singleton; 
        }
        
    /* other methods protected by singleton-ness*/
    protected static void demoMethod(){
        System.out.println("demoMethod for singleton");
    }

}
