package oop_concepts.Polymorfism;

public class PolyTest {
    public static void main(String[] args) {
        PolyExampleImp impletacion1 = new PolyExampleImp();
        Calcudalora calcudalora = new Calcudalora();
        System.out.println("Suma 1 "+impletacion1.sumar(12,15));
        System.out.println("Resta 1 "+impletacion1.restar(25,10));
        System.out.println("implementacion II");
        System.out.println("Suma 2 "+calcudalora.sumar(12,15));
        System.out.println("Resta 2 "+calcudalora.restar(25,10));

    }


}
