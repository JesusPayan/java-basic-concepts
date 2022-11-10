package collections.main;

import collections.List.ArrayListExample;
import collections.List.LinkedListExample;
import collections.List.VectorExample;
import collections.List.utilities.Dog;
import collections.List.utilities.Person;

import java.util.*;

public class Collections {


    public static void main(String[] args) {
        ArrayListExample arrayListExample = new ArrayListExample();
        LinkedListExample linkedListExample = new LinkedListExample();
        VectorExample vectorExample = new VectorExample();
        ArrayList<Person> personList = new ArrayList<>();
        ArrayList<Dog> dogList = new ArrayList<>();
        LinkedList<Person> personLinkedList = new LinkedList<>();
        LinkedList<Dog> dogLinkedList = new LinkedList<>();
        Vector<Person> personVector = new Vector<>();
        Vector<Dog> dogVector = new Vector<>();

        String opcion;
        String clase;
        String seguir_clase;
        int operacion;
        int index_person;
        int index_dog;

        Dog dog = new Dog();
        String race;
        String color;
        String size;
        Person person = new Person();
        String name;
        String lasname;
        String gender;

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        boolean flag2 = true;

        //Comienza proceso de menu
        while (flag) {
            System.out.println("¿Qué clase desea trabajar?");
            System.out.println("(L) --> LinkedList ");
            System.out.println("(A) --> ArrayList ");
            System.out.println("(V) --> Vector ");
            System.out.println("(S) --> Stack ");
            System.out.println("(C) --> Cancelar ");
            opcion = scanner.next();
            opcion = opcion.toUpperCase();
            switch (opcion) {
                //ArrayList
                case "A": {
                    System.out.println("¿Qué clase desea utilizar? Dog (D) o Person (P)");
                    clase = scanner.next();
                    clase = clase.toUpperCase();
                    //Caso de la clase Dog
                    if (clase.equals("D")) {
                        mostrarOpciones();
                        operacion = scanner.nextInt();
                        flag2 = true;
                        while (flag2) {
                            //Operaciones
                            switch (operacion) {
                                case 1: {
                                    System.out.println("Ingrese la raza del perro:");
                                    race = scanner.next();
                                    dog.setRace(race);
                                    System.out.println("Ingrese color del perro:");
                                    color = scanner.next();
                                    dog.setColor(color);
                                    System.out.println("Ingrese tamaño del perro:");
                                    size = scanner.next();
                                    dog.setSize(size);
                                    arrayListExample.addDog(dogList, dog);
                                    System.out.println("Perro " + dog.getRace() + " ::Añadido!::");
                                    dog = new Dog();
                                    break;
                                }
                                case 2: {
                                    System.out.println("Tamaño de lista: " + arrayListExample.sizeDog(dogList));
                                    break;
                                }
                                case 3: {
                                    System.out.println("¿Cual número de perro desea borrar?");
                                    index_dog = scanner.nextInt();
                                    arrayListExample.removeDog(dogList, index_dog);
                                    System.out.println("Perro Removido!");
                                    break;
                                }
                                case 4: {
                                    arrayListExample.showDogs(dogList);
                                    break;
                                }
                                case 5: {
                                    arrayListExample.reverseDogs(dogList);
                                    break;
                                }
                                case 6: {
                                    arrayListExample.deleteAllDogs(dogList);
                                    break;
                                }
                            }
                            //Confirmación de proceso de operaciones
                            System.out.println("¿Desea seguir con esta colección? (S) (N)");
                            seguir_clase = scanner.next();
                            seguir_clase = seguir_clase.toUpperCase();
                            if (seguir_clase.equals("S")) {
                                mostrarOpciones();
                                operacion = scanner.nextInt();
                            } else {
                                flag2 = false;
                            }

                        }
                        //Opcion de clase Persona
                    } else {
                        mostrarOpciones();
                        operacion = scanner.nextInt();
                        flag2 = true;
                        //Operaciones
                        while (flag2) {
                            switch (operacion) {
                                case 1: {
                                    System.out.println("Ingrese el nombre de la persona");
                                    name = scanner.next();
                                    person.setNombre(name);
                                    System.out.println("Ingrese el apellido de la persona");
                                    lasname = scanner.next();
                                    person.setApellido(lasname);
                                    System.out.println("Ingrese el género de la persona");
                                    gender = scanner.next();
                                    person.setGenero(gender);
                                    arrayListExample.addPerson(personList, person);
                                    System.out.println("" + person.getNombre() + " ::Añadid@!::");
                                    person = new Person();
                                    break;
                                }
                                case 2: {
                                    System.out.println("Tamaño de lista" + arrayListExample.sizePerson(personList));
                                    break;
                                }
                                case 3: {
                                    System.out.println("¿Cual número de persona desea borrar?");
                                    index_person = scanner.nextInt();
                                    arrayListExample.removePerson(personList, index_person);
                                    System.out.println("Persona Removida!");
                                }
                                case 4: {
                                    arrayListExample.showPersons(personList);
                                    break;
                                }
                                case 5: {
                                    arrayListExample.reversePersons(personList);
                                    break;
                                }
                                case 6: {
                                    arrayListExample.deleteAllPersons(personList);
                                    break;
                                }
                            }
                            //Confirmación de proceso de operaciones
                            System.out.println("¿Desea seguir con esta colección? (S) (N)");
                            seguir_clase = scanner.next();
                            seguir_clase = seguir_clase.toUpperCase();
                            if (seguir_clase.equals("S")) {
                                mostrarOpciones();
                                operacion = scanner.nextInt();
                            } else {
                                flag2 = false;
                            }
                        }
                    }
                    break;
                }

                //LinkedList
                case "L": {
                    System.out.println("¿Qué clase desea utilizar? Dog (D) o Person (P)");
                    clase = scanner.next();
                    clase = clase.toUpperCase();
                    if (clase.equals("D")) {
                        mostrarOpciones();
                        operacion = scanner.nextInt();
                        flag2 = true;
                        while (flag2) {
                            switch (operacion) {
                                case 1: {
                                    System.out.println("Ingrese la raza del perro:");
                                    race = scanner.next();
                                    dog.setRace(race);
                                    System.out.println("Ingrese color del perro:");
                                    color = scanner.next();
                                    dog.setColor(color);
                                    System.out.println("Ingrese tamaño del perro:");
                                    size = scanner.next();
                                    dog.setSize(size);
                                    linkedListExample.addDog(dogLinkedList, dog);
                                    System.out.println("Perro " + dog.getRace() + " ::Añadido!::");
                                    dog = new Dog();
                                    break;
                                }
                                case 2: {
                                    System.out.println("Tamaño de lista: " + linkedListExample.sizeDog(dogLinkedList));
                                    break;
                                }
                                case 3: {
                                    System.out.println("¿Cual número de perro desea borrar?");
                                    index_dog = scanner.nextInt();
                                    linkedListExample.removeDog(dogLinkedList, index_dog);
                                    System.out.println("Perro Removido!");
                                    break;
                                }
                                case 4: {
                                    linkedListExample.showDogs(dogLinkedList);
                                    break;
                                }
                                case 5: {
                                    linkedListExample.reverseDogs(dogLinkedList);
                                    break;
                                }
                                case 6: {
                                    linkedListExample.deleteAllDogs(dogLinkedList);
                                    break;
                                }
                            }
                            System.out.println("¿Desea seguir con esta colección? (S) (N)");
                            seguir_clase = scanner.next();
                            seguir_clase = seguir_clase.toUpperCase();
                            if (seguir_clase.equals("S")) {
                                mostrarOpciones();
                                operacion = scanner.nextInt();
                            } else {
                                flag2 = false;
                            }

                        }

                    } else {
                        mostrarOpciones();
                        operacion = scanner.nextInt();
                        flag2 = true;
                        while (flag2) {
                            switch (operacion) {
                                case 1: {
                                    System.out.println("Ingrese el nombre de la persona");
                                    name = scanner.next();
                                    person.setNombre(name);
                                    System.out.println("Ingrese el apellido de la persona");
                                    lasname = scanner.next();
                                    person.setApellido(lasname);
                                    System.out.println("Ingrese el género de la persona");
                                    gender = scanner.next();
                                    person.setGenero(gender);
                                    linkedListExample.addPerson(personLinkedList, person);
                                    System.out.println("" + person.getNombre() + " ::Añadid@!::");
                                    person = new Person();
                                    break;
                                }
                                case 2: {
                                    System.out.println("Tamaño de lista: " + linkedListExample.sizePerson(personLinkedList));
                                    break;
                                }
                                case 3: {
                                    System.out.println("¿Cual número de persona desea borrar?");
                                    index_person = scanner.nextInt();
                                    linkedListExample.removePerson(personLinkedList, index_person);
                                    System.out.println("Persona Removida!");
                                }
                                case 4: {
                                    linkedListExample.showPersons(personLinkedList);
                                    break;
                                }
                                case 5: {
                                    linkedListExample.reversePersons(personLinkedList);
                                    break;
                                }
                                case 6: {
                                    linkedListExample.deleteAllPersons(personLinkedList);
                                    break;
                                }
                            }
                            System.out.println("¿Desea seguir con esta colección? (S) (N)");
                            seguir_clase = scanner.next();
                            seguir_clase = seguir_clase.toUpperCase();
                            if (seguir_clase.equals("S")) {
                                mostrarOpciones();
                                operacion = scanner.nextInt();
                            } else {
                                flag2 = false;
                            }
                        }
                    }
                    break;

                }

                //Vector
                case "V":{
                    System.out.println("¿Qué clase desea utilizar? Dog (D) o Person (P)");
                    clase = scanner.next();
                    clase = clase.toUpperCase();
                    if (clase.equals("D")) {
                        mostrarOpciones();
                        operacion = scanner.nextInt();
                        flag2 = true;
                        while (flag2) {
                            switch (operacion) {
                                case 1: {
                                    System.out.println("Ingrese la raza del perro:");
                                    race = scanner.next();
                                    dog.setRace(race);
                                    System.out.println("Ingrese color del perro:");
                                    color = scanner.next();
                                    dog.setColor(color);
                                    System.out.println("Ingrese tamaño del perro:");
                                    size = scanner.next();
                                    dog.setSize(size);
                                    vectorExample.addDog(dogVector, dog);
                                    System.out.println("Perro " + dog.getRace() + " ::Añadido!::");
                                    dog = new Dog();
                                    break;
                                }
                                case 2: {
                                    System.out.println("Tamaño de lista: " + vectorExample.sizeDog(dogVector));
                                    break;
                                }
                                case 3: {
                                    System.out.println("¿Cual número de perro desea borrar?");
                                    index_dog = scanner.nextInt();
                                    vectorExample.removeDog(dogVector, index_dog);
                                    System.out.println("Perro Removido!");
                                    break;
                                }
                                case 4: {
                                    vectorExample.showDogs(dogVector);
                                    break;
                                }
                                case 5: {
                                    vectorExample.reverseDogs(dogVector);
                                    break;
                                }
                                case 6: {
                                    vectorExample.deleteAllDogs(dogVector);
                                    break;
                                }
                            }
                            System.out.println("¿Desea seguir con esta colección? (S) (N)");
                            seguir_clase = scanner.next();
                            seguir_clase = seguir_clase.toUpperCase();
                            if (seguir_clase.equals("S")) {
                                mostrarOpciones();
                                operacion = scanner.nextInt();
                            } else {
                                flag2 = false;
                            }

                        }

                    } else {
                        mostrarOpciones();
                        operacion = scanner.nextInt();
                        flag2 = true;
                        while (flag2) {
                            switch (operacion) {
                                case 1: {
                                    System.out.println("Ingrese el nombre de la persona");
                                    name = scanner.next();
                                    person.setNombre(name);
                                    System.out.println("Ingrese el apellido de la persona");
                                    lasname = scanner.next();
                                    person.setApellido(lasname);
                                    System.out.println("Ingrese el género de la persona");
                                    gender = scanner.next();
                                    person.setGenero(gender);
                                    vectorExample.addPerson(personVector, person);
                                    System.out.println("" + person.getNombre() + " ::Añadid@!::");
                                    person = new Person();
                                    break;
                                }
                                case 2: {
                                    System.out.println("Tamaño de lista: " + vectorExample.sizePerson(personVector));
                                    break;
                                }
                                case 3: {
                                    System.out.println("¿Cual número de persona desea borrar?");
                                    index_person = scanner.nextInt();
                                    vectorExample.removePerson(personVector, index_person);
                                    System.out.println("Persona Removida!");
                                }
                                case 4: {
                                    vectorExample.showPersons(personVector);
                                    break;
                                }
                                case 5: {
                                    vectorExample.reversePersons(personVector);
                                    break;
                                }
                                case 6: {
                                    vectorExample.deleteAllPersons(personVector);
                                    break;
                                }
                            }
                            System.out.println("¿Desea seguir con esta colección? (S) (N)");
                            seguir_clase = scanner.next();
                            seguir_clase = seguir_clase.toUpperCase();
                            if (seguir_clase.equals("S")) {
                                mostrarOpciones();
                                operacion = scanner.nextInt();
                            } else {
                                flag2 = false;
                            }
                        }
                    }
                    break;
                }

                default:{
                    System.out.println("Saliendo del programa...");
                    flag = false;
                }
            }
        }


    }

    public static void mostrarOpciones() {
        System.out.println("¿Qué operación desea utilizar?");
        System.out.println("(1) --> Agregar Objeto ");
        System.out.println("(2) --> Mostrar tamaño lista ");
        System.out.println("(3) --> Borrar Objeto ");
        System.out.println("(4) --> Mostrar lista ");
        System.out.println("(5) --> Voltear lista ");
        System.out.println("(6) --> Eliminación total lista ");
    }

}
