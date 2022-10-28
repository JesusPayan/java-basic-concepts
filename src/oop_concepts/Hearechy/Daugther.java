package oop_concepts.Hearechy;

public class Daugther extends Father{
    public Daugther(String colorEyes, String colorHair) {
        super(colorEyes, colorHair);
    }

    public static void main(String[] args) {
        Daugther newDaugther = new Daugther("Blue","Gray");
        System.out.println("Color de ojos del hija " + newDaugther.colorEyes);
        System.out.println("Color de cabello del hija " + newDaugther.getColorHair());
        System.out.println("......................");

    }
}
