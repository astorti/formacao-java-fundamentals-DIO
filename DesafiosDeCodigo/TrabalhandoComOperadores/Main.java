package DesafiosDeCodigo.TrabalhandoComOperadores;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        int a = scanner.nextInt();

        System.out.print("Informe o segundo valor: ");
        int b = scanner.nextInt();

        // Implemente as operações solicitadas na descrição  e exibir o resultado
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        scanner.close();
    }
}
