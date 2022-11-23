package collections.List;

import collections.List.utilities.Dog;
import collections.List.utilities.Person;

import java.util.LinkedList;
import java.util.List;
/*TODO:Create a LinkedList of Person and Dog in utilities packqge
 *  apply the methods add remove, removeAll, size to array*/


public class LinkedListExample {

    public static void main(String[] args) {
        List<Person> personLinked = new LinkedList<>();
        personLinked.add(new Person(1,"Agustin"));
        personLinked.add(new Person(2,"Sharon"));
        personLinked.add(new Person(3,"Marcos"));

        personLinked.remove(2);



        for (int i = 0 ; i< personLinked.size();i++){
            System.out.println(personLinked.get(i).id + " " + personLinked.get(i).name);
        }
        System.out.println("el total de datos en la lista es:"+personLinked.size());

        /////////////////////////////////////////////////////////////////


        List<Dog> dogLinked= new  LinkedList<>();
        dogLinked.add(new Dog(1,"sasha"));
        dogLinked.add(new Dog(2,"cuco"));
        dogLinked.add(new Dog(3,"sam"));
        dogLinked.add(new Dog(4,"pepito"));

        dogLinked.remove(2);

        for (int i = 0 ; i< dogLinked.size();i++) {
            System.out.println(dogLinked.get(i).id + " " + dogLinked.get(i).name);
        }
        System.out.println("el total de datos en la lista es:"+dogLinked.size());
    }



}
