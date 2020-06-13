package lambda_expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitOneExercise{

        
        //2. create a method that prints all elements in the list
    public static void printAllElements(List<Person> people){
        for (Person p: people) {
            System.out.println(p);
        }
    }
        //3. create a method that prints all people that have last name beginning with A
    public static void namesBeginningWithA(List<Person> people){
        for (Person p: people) {
            if (p.getLastName().startsWith("A")){
                System.out.println(p);
            }
        }
    }
    


    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Dare", "Adewumi", 22),
            new Person("Seyi", "Adewumi", 23),
            new Person("Oj", "Njeze", 23),
            new Person("Michael", "Ojei", 22)
        );

        //1. sort the list by last name

        Collections.sort(people, new Comparator<Person>(){
            @Override
            public int compare(Person a1, Person a2){
                return a1.getLastName().compareTo(a2.getLastName());
            }
        });

        //2.
        printAllElements(people);

        //3
        namesBeginningWithA(people);
    }
}