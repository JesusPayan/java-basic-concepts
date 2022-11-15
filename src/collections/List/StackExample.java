package collections.List;

import collections.List.utilities.Dog;
import collections.List.utilities.Person;

import java.util.Stack;

public class StackExample {

    public Stack<Person> addPerson(Stack<Person> personStack, Person person) {
        personStack.add(person);
        return personStack;
    }

    public Stack<Dog> addDog(Stack<Dog> dogStack, Dog dog) {
        dogStack.add(dog);
        return dogStack;
    }

    public Stack<Person> removePerson(Stack<Person> personStack, int index) {
        personStack.remove(index);
        return personStack;
    }

    public Stack<Dog> removeDog(Stack<Dog> dogStack, int index) {
        dogStack.remove(index);
        return dogStack;
    }

    public int sizePerson(Stack<Person> personStack) {
        return personStack.size();
    }

    public int sizeDog(Stack<Dog> dogStack) {
        return dogStack.size();
    }

    public void showPersons(Stack<Person> personStack) {
        System.out.println("--Personas en el Vector--");
        for (Person person : personStack) {
            System.out.println(person.getNombre());
        }
        System.out.println("--------------------------");
    }

    public void showDogs(Stack<Dog> dogStack) {
        System.out.println("--Perros en el Vector--");
        for (Dog dog : dogStack) {
            System.out.println(dog.getRace());
        }
        System.out.println("--------------------------");
    }

    public void reversePersons(Stack<Person> personStack) {
        for (int i = personStack.size() - 1; i >= 0; i--) {
            System.out.println(personStack.get(i).getNombre());
        }
    }

    public void reverseDogs(Stack<Dog> dogStack) {
        for (int i = dogStack.size() - 1; i >= 0; i--) {
            System.out.println(dogStack.get(i).getRace());
        }
    }

    public void deleteAllPersons(Stack<Person> personStack) {
        System.out.println("Tamaño antes:: " + personStack.size());
        personStack.clear();
        System.out.println("Tamaño después:: " + personStack.size());
    }

    public void deleteAllDogs(Stack<Dog> dogStack) {
        System.out.println("Tamaño antes:: " + dogStack.size());
        dogStack.clear();
        System.out.println("Tamaño después:: " + dogStack.size());
    }


}



