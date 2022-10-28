package oop_concepts.Encaptulation;

public class Person {
    //public, private, protect, default
    private long id;
    private int age;
    private String name;

    public Person() {
    }

    public Person(long id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    //getter y setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
