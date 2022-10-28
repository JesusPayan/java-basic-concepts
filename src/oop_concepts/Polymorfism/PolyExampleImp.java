package oop_concepts.Polymorfism;

public class PolyExampleImp implements PolyExample{
    @Override
    public int sumar(int x, int y) {
        int suma = x+y;
        return suma;
    }

    @Override
    public int restar(int x, int y) {
        int resta = x-y;
        return resta;
    }
}
