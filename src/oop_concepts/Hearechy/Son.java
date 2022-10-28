package oop_concepts.Hearechy;

public class Son extends Father{
    //String colorojos
    //String colorde pelo

    public Son(String colorEyes, String colorHair) {
        super(colorEyes, colorHair);
    }


    public static void main(String[] args) {
        Son newSon = new Son("Green","Black");
        System.out.println("Color de ojos del hijo" + newSon.colorEyes);
        System.out.println("Color de cabello del hijo" + newSon.getColorHair());
        System.out.println("......................");
        newSon.move();
    }

}
