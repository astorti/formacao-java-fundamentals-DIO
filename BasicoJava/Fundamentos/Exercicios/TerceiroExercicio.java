// Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela

package BasicoJava.Fundamentos.Exercicios;

import java.util.Scanner;

public class TerceiroExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da base do retangulo: ");
        int base = scanner.nextInt();
        System.out.print("Informe o tamanho da altura do retangulo: ");
        int altura = scanner.nextInt();
        int area = base * altura;
        System.out.printf("A área do retangulo de tamanho %sm x %sm é %sm²\n", base, altura, area);

        scanner.close();
    }
}
