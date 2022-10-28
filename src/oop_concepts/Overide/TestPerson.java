package oop_concepts.Overide;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person(23);
        Person person2 = new Person("Jorge");
        Person person3 = new Person(34,"Juan");
        System.out.println("Persona 1:"+ person.name + " "+ person.age);
        System.out.println("Persona 2:"+ person2.name + " "+ person2.age);
        System.out.println("Persona 3:"+ person3.name + " "+ person3.age);

        System.out.println("Camina:" + person.caminar(10));
        System.out.println("Camina Sobrecargado 1:" + person.caminar(15.0));
        person.caminar();
    }


}
