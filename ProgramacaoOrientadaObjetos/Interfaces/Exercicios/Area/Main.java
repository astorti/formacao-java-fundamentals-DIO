package ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Area;

import java.util.Scanner;

import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Area.Interfaces.GeometricForm;
import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Area.Records.Circle;
import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Area.Records.Rectangle;
import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Area.Records.Square;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        GeometricForm geometricForm = null;

        while (true) {
            System.out.println("Escolha a forma geométrica para calcular a área:");
            System.out.println("1) Quadrado");
            System.out.println("2) Retangulo");
            System.out.println("3) Círculo");
            System.out.println("4) Saír do programa");
            option = scanner.nextInt();

            if (option == 1)
                geometricForm = createSquare();
            if (option == 2)
                geometricForm = createRectangle();
            if (option == 3)
                geometricForm = createCircle();
            if (option < 1 || option > 4) {
                System.out.println("Opção Inválida!");
                continue;
            }
            if (option == 4) {
                break;
            }

            System.out.println("A área calculada é de " + geometricForm.getArea());
        }

    }

    private static GeometricForm createSquare() {
        System.out.print("Informe o tamanho dos lados: ");
        double side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRectangle() {
        System.out.print("Informe o tamanho da altura: ");
        double height = scanner.nextDouble();
        System.out.print("Informe o tamanho da base: ");
        double base = scanner.nextDouble();
        return new Rectangle(height, base);
    }

    private static GeometricForm createCircle() {
        System.out.print("Informe o tamanho do raio: ");
        double radius = scanner.nextDouble();
        return new Circle(radius);
    }

}
