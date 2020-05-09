public class Employee{
    
    //salary variable is a private static variable
    private static double salary = 100.0;
    private double bonus = 20.0;

    //Department is a constant
    public static final String DEPARTMENT = "Development";
    public static void main(String args[]){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e2.bonus = 30.0;
        System.out.println(e1.bonus);
        System.out.println(e2.bonus);
    }
}
