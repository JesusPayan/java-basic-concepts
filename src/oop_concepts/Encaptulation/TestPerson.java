package oop_concepts.Encaptulation;

public class TestPerson {
    static Person person = new Person();
    static Person person2= new Person();
    public TestPerson(Person person) {
        this.person = person;
    }



    public static void main(String[] args) {
        person.setId(10001);
        person.setName("Pedro");
        person.setAge(34);
        System.out.println("Nombre: " + person.getName()+ " Edad: "+ person.getAge() +" " + "ID: "+ person.getId());
        person2.setId(2001);
        person2.setName("Juan");
        person2.setAge(50);
        System.out.println("Nombre: " + person2.getName()+ " Edad: "+ person2.getAge() +" " + "ID: "+ person2.getId());
    }

}
