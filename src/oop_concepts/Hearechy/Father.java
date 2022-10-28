package oop_concepts.Hearechy;

public class Father {
    String colorEyes;
    String ColorHair;
    public void move(){
        System.out.println("Hello im moving...");
    }

    public Father(String colorEyes, String colorHair) {
        this.colorEyes = colorEyes;
        ColorHair = colorHair;
    }

    public String getColorEyes() {
        return colorEyes;
    }

    public void setColorEyes(String colorEyes) {
        this.colorEyes = colorEyes;
    }

    public String getColorHair() {
        return ColorHair;
    }

    public void setColorHair(String colorHair) {
        ColorHair = colorHair;
    }
}
