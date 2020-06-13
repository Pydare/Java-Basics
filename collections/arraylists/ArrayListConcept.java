package collections.arraylists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

    public static void main(String[] args) {
        int a[] = new int[3]; //static arrays

        //dynamic array --> ArrayList
        ArrayList arr = new ArrayList();  //non-generic array list object
        arr.add(10);
        arr.add(20);
        arr.add(10);
        arr.add("stringy");
        System.out.println(arr.get(0));

        //printing values in arraylist using for loop or iterator 
        for(int i=0; i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        //non-generics vs generics in java

        ArrayList<Employee> arr1 = new ArrayList<Employee>();  //generic array list object storing only integers
        Employee e1 = new Employee("Dare",21,"Elect/Elect");
        Employee e2 = new Employee("Seyi", 22, "Civil");
        Employee e3 = new Employee("Hakeem", 21, "Chemical");

        arr1.add(e1);
        arr1.add(e2);
        arr1.add(e3);

        //using an iterator to traverse the values
        Iterator<Employee> it = arr1.iterator();
        while(it.hasNext()){
            Employee emp = it.next();
            System.out.println(emp.toString());
        }

    }


}