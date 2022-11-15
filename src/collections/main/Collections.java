package collections.main;

import collections.List.ArrayListExample;
import collections.List.LinkedListExample;
import collections.List.StackExample;
import collections.List.VectorExample;
import collections.List.utilities.Dog;
import collections.List.utilities.Person;
import com.sun.istack.internal.Nullable;

import java.util.*;

public class Collections {


    public static void main(String[] args) {
        ArrayListExample arrayListExample = new ArrayListExample();
        LinkedListExample linkedListExample = new LinkedListExample();
        VectorExample vectorExample = new VectorExample();
        StackExample stackExample = new StackExample();
        ArrayList<Person> personList = new ArrayList<>();
        ArrayList<Dog> dogList = new ArrayList<>();
        LinkedList<Person> personLinkedList = new LinkedList<>();
        LinkedList<Dog> dogLinkedList = new LinkedList<>();
        Vector<Person> personVector = new Vector<>();
        Vector<Dog> dogVector = new Vector<>();
        Stack<Person> personStack = new Stack<>();
        Stack<Dog> dogStack = new Stack<>();


        String opcion;
        String clase;
        String seguir_clase;
        int operacion;
        int index_person;
        int index_dog;

        Dog dog = new Dog();
        String race = "";
        String color = "";
        String size = "";
        Person person = new Person();
        String name = "";
        String lastname = "";
        String gender = "";

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
                                    pedirDatos(scanner, dogList, dog, race, size, color, arrayListExample);
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
                                    pedirDatos(scanner, personList, person, name, lastname, gender, arrayListExample);
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
                                    pedirDatos(scanner, dogLinkedList, dog, race, size, color, linkedListExample);
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
                                    pedirDatos(scanner, personLinkedList, person, name, lastname, gender, linkedListExample);
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
                case "V": {
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
                                    pedirDatos(scanner, dogVector, dog, race, size, color, vectorExample);
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
                                    pedirDatos(scanner, personVector, person, name, lastname, gender, vectorExample);
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

                case "S": {
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
                                    pedirDatos(scanner, dogStack, dog, race, size, color, stackExample);
                                    break;
                                }
                                case 2: {
                                    System.out.println("Tamaño de lista: " + stackExample.sizeDog(dogStack));
                                    break;
                                }
                                case 3: {
                                    System.out.println("¿Cual número de perro desea borrar?");
                                    index_dog = scanner.nextInt();
                                    stackExample.removeDog(dogStack, index_dog);
                                    System.out.println("Perro Removido!");
                                    break;
                                }
                                case 4: {
                                    stackExample.showDogs(dogStack);
                                    break;
                                }
                                case 5: {
                                    stackExample.reverseDogs(dogStack);
                                    break;
                                }
                                case 6: {
                                    stackExample.deleteAllDogs(dogStack);
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
                                    pedirDatos(scanner, personStack, person, name, lastname, gender, stackExample);
                                    break;
                                }
                                case 2: {
                                    System.out.println("Tamaño de lista: " + stackExample.sizePerson(personStack));
                                    break;
                                }
                                case 3: {
                                    System.out.println("¿Cual número de persona desea borrar?");
                                    index_person = scanner.nextInt();
                                    stackExample.removePerson(personStack, index_person);
                                    System.out.println("Persona Removida!");
                                }
                                case 4: {
                                    stackExample.showPersons(personStack);
                                    break;
                                }
                                case 5: {
                                    stackExample.reversePersons(personStack);
                                    break;
                                }
                                case 6: {
                                    stackExample.deleteAllPersons(personStack);
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
                default: {
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


    public static void pedirDatos(Scanner scanner, ArrayList<Dog> dogList, Dog dog, String race, String size, String color, ArrayListExample arrayListExample) {
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
    }

    public static void pedirDatos(Scanner scanner, ArrayList<Person> personList, Person person, String name, String lastname, String gender, ArrayListExample arrayListExample) {
        System.out.println("Ingrese el nombre de la persona");
        name = scanner.next();
        person.setNombre(name);
        System.out.println("Ingrese el apellido de la persona");
        lastname = scanner.next();
        person.setApellido(lastname);
        System.out.println("Ingrese el género de la persona");
        gender = scanner.next();
        person.setGenero(gender);
        arrayListExample.addPerson(personList, person);
        System.out.println("" + person.getNombre() + " ::Añadid@!::");
        person = new Person();
    }

    public static void pedirDatos(Scanner scanner, LinkedList<Dog> dogLinkedList, Dog dog, String race, String size, String color, LinkedListExample linkedListExample) {
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
    }

    public static void pedirDatos(Scanner scanner, LinkedList<Person> personLinkedList, Person person, String name, String lastname, String gender, LinkedListExample linkedListExample) {
        System.out.println("Ingrese el nombre de la persona");
        name = scanner.next();
        person.setNombre(name);
        System.out.println("Ingrese el apellido de la persona");
        lastname = scanner.next();
        person.setApellido(lastname);
        System.out.println("Ingrese el género de la persona");
        gender = scanner.next();
        person.setGenero(gender);
        linkedListExample.addPerson(personLinkedList, person);
        System.out.println("" + person.getNombre() + " ::Añadid@!::");
        person = new Person();
    }


    public static void pedirDatos(Scanner scanner, Vector<Person> personVector, Person person, String name, String lastname, String gender, VectorExample vectorExample) {
        System.out.println("Ingrese el nombre de la persona");
        name = scanner.next();
        person.setNombre(name);
        System.out.println("Ingrese el apellido de la persona");
        lastname = scanner.next();
        person.setApellido(lastname);
        System.out.println("Ingrese el género de la persona");
        gender = scanner.next();
        person.setGenero(gender);
        vectorExample.addPerson(personVector, person);
        System.out.println("" + person.getNombre() + " ::Añadid@!::");
        person = new Person();
    }

    public static void pedirDatos(Scanner scanner, Vector<Dog> dogVector, Dog dog, String race, String size, String color, VectorExample vectorExample) {
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
    }

    public static void pedirDatos(Scanner scanner, Stack<Person> personStack, Person person, String name, String lastname, String gender, StackExample stackExample){
        System.out.println("Ingrese el nombre de la persona");
        name = scanner.next();
        person.setNombre(name);
        System.out.println("Ingrese el apellido de la persona");
        lastname = scanner.next();
        person.setApellido(lastname);
        System.out.println("Ingrese el género de la persona");
        gender = scanner.next();
        person.setGenero(gender);
        stackExample.addPerson(personStack, person);
        System.out.println("" + person.getNombre() + " ::Añadid@!::");
        person = new Person();
    }

    public static void pedirDatos(Scanner scanner, Stack<Dog> dogStack, Dog dog, String race, String size, String color, StackExample stackExample){
        System.out.println("Ingrese la raza del perro:");
        race = scanner.next();
        dog.setRace(race);
        System.out.println("Ingrese color del perro:");
        color = scanner.next();
        dog.setColor(color);
        System.out.println("Ingrese tamaño del perro:");
        size = scanner.next();
        dog.setSize(size);
        stackExample.addDog(dogStack, dog);
        System.out.println("Perro " + dog.getRace() + " ::Añadido!::");
        dog = new Dog();
    }

}
