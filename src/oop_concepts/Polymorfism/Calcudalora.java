package oop_concepts.Polymorfism;

public class Calcudalora implements PolyExample{
    @Override
    public int sumar(int x, int y) {
        return x+y;
    }

    @Override
    public int restar(int x, int y) {
        return x-y;
    }
}
