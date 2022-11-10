package collections.List;

import collections.List.utilities.Dog;
import collections.List.utilities.Person;

import java.util.Vector;

/*TODO:Create a LinkedList of Person and Dog in utilities packqge
 *  apply the methods add remove, removeAll, size to array*/
public class VectorExample {
    public Vector<Person> addPerson(Vector<Person> personVector, Person person) {
        personVector.add(person);
        return personVector;
    }

    public Vector<Dog> addDog(Vector<Dog> dogVector, Dog dog){
        dogVector.add(dog);
        return dogVector;
    }

    public Vector<Person> removePerson(Vector<Person> personVector, int index){
        personVector.remove(index);
        return personVector;
    }

    public Vector<Dog> removeDog(Vector<Dog> dogVector, int index){
        dogVector.remove(index);
        return dogVector;
    }

    public int sizePerson(Vector<Person> personVector){
        return personVector.size();
    }

    public int sizeDog(Vector<Dog> dogVector){
        return dogVector.size();
    }

    public void showPersons(Vector<Person> personVector){
        System.out.println("--Personas en el Vector--");
        for(Person person: personVector){
            System.out.println(person.getNombre());
        }
        System.out.println("--------------------------");
    }

    public void showDogs(Vector<Dog> dogsVector){
        System.out.println("--Perros en el Vector--");
        for(Dog dog: dogsVector){
            System.out.println(dog.getRace());
        }
        System.out.println("--------------------------");
    }

    public void reversePersons(Vector<Person> personVector){
        for (int i = personVector.size()-1; i >=0; i--) {
            System.out.println(personVector.get(i).getNombre());
        }
    }

    public void reverseDogs(Vector<Dog> dogVector){
        for (int i = dogVector.size()-1; i >=0; i--) {
            System.out.println(dogVector.get(i).getRace());
        }
    }

    public void deleteAllPersons(Vector<Person> personVector){
        System.out.println("Tamaño antes:: "+personVector.size());
        personVector.clear();
        System.out.println("Tamaño después:: "+personVector.size());
    }

    public void deleteAllDogs(Vector<Dog> dogVector){
        System.out.println("Tamaño antes:: "+dogVector.size());
        dogVector.clear();
        System.out.println("Tamaño después:: "+dogVector.size());
    }


}
