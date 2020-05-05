public class Puppy{

    int puppyAge;

    public Puppy(String name){
        //The constructor has one parameter, name
        System.out.println("Name chosen is; "+ name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("Puppy's age is: " + puppyAge);
        return puppyAge;
    }

    public static void main(String [] args){

        //object creation
        Puppy myPuppy = new Puppy("Pink");

        //call class method to set puppy's age
        myPuppy.setAge(2);

        //call another class method to get puppy's age
        myPuppy.getAge();

        //Can access instance variable as follows as well
        System.out.println(("Variable Value:" + myPuppy.puppyAge));
    }
}