package DesafiosDeCodigo.EstruturasCondicionaisIfElse;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota (0-10): ");
        double nota = scanner.nextDouble();

        // Implemente a estrutura condicional para verificar a classificação da nota:
        if (nota < 5) {
          System.out.println("Reprovado");
        } else if (nota < 7) {
          System.out.println("Recuperacao");
        } else {
          System.out.println("Aprovado");
        }

        scanner.close();
    }
}
