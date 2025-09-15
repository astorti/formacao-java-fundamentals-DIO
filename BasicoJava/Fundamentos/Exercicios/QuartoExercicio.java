// Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

package BasicoJava.Fundamentos.Exercicios;

import java.util.Scanner;

public class QuartoExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome da primeira pessoa: ");
        String nome1 = scanner.next();
        System.out.print("Qual é a idade da primeira pessoa? ");
        int idade1 = scanner.nextInt();
        System.out.print("Informe o nome da segunda pessoa: ");
        String nome2 = scanner.next();
        System.out.print("Qual é a idade da segunda pessoa? ");
        int idade2 = scanner.nextInt();
        System.out.printf("A diferença de idade entre %s e %s é de %s anos\n", nome1, nome2, idade1 - idade2);
        
        scanner.close();
    }
}
