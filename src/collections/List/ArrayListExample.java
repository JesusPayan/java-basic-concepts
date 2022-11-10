package collections.List;

import collections.List.utilities.Dog;
import collections.List.utilities.Person;

import java.util.ArrayList;
import java.util.List;

/*TODO:Create a ArrayList of Person and Dog
 *  apply the methods add remove, removeAll, size to array*/
public class ArrayListExample {

    public ArrayList<Person> addPerson(ArrayList<Person> personArrayList, Person person) {
        personArrayList.add(person);
        return personArrayList;
    }

    public ArrayList<Dog> addDog(ArrayList<Dog> dogArrayList, Dog dog) {
        dogArrayList.add(dog);
        return dogArrayList;
    }

    public ArrayList<Person> removePerson(ArrayList<Person> personArrayList, int index) {
        personArrayList.remove(index);
        return personArrayList;
    }

    public ArrayList<Dog> removeDog(ArrayList<Dog> dogArrayList, int index) {
        dogArrayList.remove(index);
        return dogArrayList;
    }

    public int sizeDog(ArrayList<Dog> list) {
        return list.size();
    }

    public int sizePerson(ArrayList<Person> list) {
        return list.size();
    }


    public void showPersons(ArrayList<Person> list) {
        System.out.println("--Personas en el ArrayList--");
        for (Person person :
                list) {
            System.out.println(person.getNombre());
        }
        System.out.println("--------------------------");

    }

    public void showDogs(ArrayList<Dog> list) {
        System.out.println("--Perros en el ArrayList--");
        for (Dog dog :
                list) {

            System.out.println(dog.getRace());
        }
        System.out.println("--------------------------");

    }

    public void reverseDogs(ArrayList<Dog> dogArrayList) {
        for (int i = dogArrayList.size() - 1; i >= 0; i--) {
            System.out.println(dogArrayList.get(i).getRace());
        }
    }

    public void reversePersons(ArrayList<Person> personArrayList) {
        for (int i = personArrayList.size() - 1; i >= 0; i--) {
            System.out.println(personArrayList.get(i).getNombre());
        }
    }

    public void deleteAllPersons(ArrayList<Person> personArrayList) {
        System.out.println("Tamaño antes::"+personArrayList.size());
        personArrayList.clear();
        System.out.println("Tamaño actual"+personArrayList.size());
    }

    public void deleteAllDogs(ArrayList<Dog> dogArrayList) {
        System.out.println("Tamaño antes::"+dogArrayList.size());
        dogArrayList.clear();
        System.out.println("Tamaño actual"+dogArrayList.size());
    }



}
