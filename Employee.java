public class Employee{
    
    //salary variable is a private static variable
    private static double salary;
    private double bonus;

    //Department is a constant
    public static final String DEPARTMENT = "Development";
    public static void main(String args[]){
        salary = 1000;
        Employee empOne = new Employee();
        Employee empTwo = new Employee();
        empOne.salary = 100;
        empOne.bonus = 10;
        empTwo.salary = 200;
        empTwo.bonus = 15;
        System.out.println(empOne.salary);
    }
}
