package collections.List;
/*TODO:Create a LinkedList of Person and Dog in utilities packqge
 *  apply the methods add remove, removeAll, size to array*/



import collections.List.utilities.Dog;
import collections.List.utilities.Person;
import java.util.LinkedList;

public class LinkedListExample {
    public LinkedList <Person> addPerson(LinkedList<Person> personLinkedList, Person person){
        personLinkedList.add(person);
        return personLinkedList;
    }

    public LinkedList<Dog> addDog(LinkedList<Dog> dogLinkedList, Dog dog){
        dogLinkedList.add(dog);
        return dogLinkedList;
    }

     public LinkedList<Person> removePerson(LinkedList<Person> personLinkedList, int index){
        personLinkedList.remove(index);
        return personLinkedList;
     }

     public LinkedList<Dog> removeDog(LinkedList<Dog> dogLinkedList, int index){
        dogLinkedList.remove(index);
        return dogLinkedList;
     }

    public int sizeDog(LinkedList<Dog> list) {
        return list.size();
    }

    public int sizePerson(LinkedList<Person> list) {
        return list.size();
    }


    public void showPersons(LinkedList<Person> list) {
        System.out.println("--Personas en el LinkedList--");
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i).getNombre());
        }
        System.out.println("--------------------------");
    }

    public void showDogs(LinkedList<Dog> list) {
        System.out.println("--Perros en el LinkedList--");
        for (int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i).getRace());
        }
        System.out.println("--------------------------");

    }

    public void reverseDogs(LinkedList<Dog> dogLinkedList) {
        for (int i = dogLinkedList.size() - 1; i >= 0; i--) {
            System.out.println(dogLinkedList.get(i).getRace());
        }
    }

    public void reversePersons(LinkedList<Person> personLinkedList) {
        for (int i = personLinkedList.size() - 1; i >= 0; i--) {
            System.out.println(personLinkedList.get(i).getNombre());
        }
    }

    public void deleteAllPersons(LinkedList<Person> personArrayList) {
        System.out.println("Tamaño antes::"+personArrayList.size());
        personArrayList.clear();
        System.out.println("Tamaño actual"+personArrayList.size());
    }

    public void deleteAllDogs(LinkedList<Dog> dogLinkedList) {
        System.out.println("Tamaño antes::"+dogLinkedList.size());
        dogLinkedList.clear();
        System.out.println("Tamaño actual"+dogLinkedList.size());
    }







}
