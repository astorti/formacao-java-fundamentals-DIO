package ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Area.Records;

import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Area.Interfaces.GeometricForm;

public record Square(double side) implements GeometricForm {

    @Override
    public double getArea() {
        return side * side;
    }
}
