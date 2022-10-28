package oop_concepts.Overide;

public class Person {
    int age;
    String name;
    /*Sobrecarga: es tener el metodo con el mismo nombre pero diferente:
    * numero de parametros,
    * direrente tipo parametros
    * diferente firma.
    * */
    //Solo recibe un entero
    public Person(int age) {
        this.age = age;
    }
//recibe un parametro de text
    public Person(String name) {
        this.name = name;
    }
    //recibe un parametro entero y uno de texto
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int caminar(int x){
        return x+x;
    }
    public double caminar(double x){
        return x+x;
    }
    public void caminar(){
        System.out.println("Caminando");
    }

}
