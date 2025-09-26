package ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Area.Records;

import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Area.Interfaces.GeometricForm;

public record Rectangle(double height, double base) implements GeometricForm {

    @Override
    public double getArea() {
        return height * base;
    }
}
