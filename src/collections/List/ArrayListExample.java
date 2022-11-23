package collections.List;
/*TODO:Create a ArrayList of Person and Dog
*  apply the methods add remove, removeAll, size to array*/

import collections.List.utilities.Dog;
import collections.List.utilities.Person;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"Juan"));
        personList.add(new Person(2,"Pedro"));
        personList.add(new Person(3,"Maria"));

        personList.remove(2);

        for (int i = 0 ; i< personList.size();i++){
            System.out.println(personList.get(i).id + " " + personList.get(i).name);


        }

        System.out.println("el total de datos en la lista es:"+personList.size());


        /////////////////////////////////////////////////////////////////

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog(1,"pepito"));
        dogList.add(new Dog(2,"coco"));
        for (int i = 0 ; i< dogList.size();i++) {
            System.out.println(dogList.get(i).id + " " + dogList.get(i).name);
        }
        System.out.println("el total de datos en la lista es:"+dogList.size());
    }
}

