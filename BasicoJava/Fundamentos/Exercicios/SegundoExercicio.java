// Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela

package BasicoJava.Fundamentos.Exercicios;

import java.util.Scanner;

public class SegundoExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do lado do quadrado: ");
        int ladoQuadrado = scanner.nextInt();
        int area = ladoQuadrado * ladoQuadrado;
        System.out.printf("A área do quadrado de tamanho %sm é %sm²\n", ladoQuadrado, area);
        
        scanner.close();
    }
}
