package ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Area.Records;

import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Area.Interfaces.GeometricForm;

public record Circle(double radius) implements GeometricForm{

    private static final double pi = 3.14;

    @Override
    public double getArea() {
        return pi * (radius * radius);
    }
}
