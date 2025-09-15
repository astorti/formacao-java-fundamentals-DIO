// Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

package BasicoJava.Fundamentos.Exercicios;

import java.util.Scanner;
import java.time.OffsetDateTime;

public class PrimeiroExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int baseYear = OffsetDateTime.now().getYear();

        System.out.print("Informe o seu nome: ");
        String name = scanner.next();
        System.out.print("Informe o ano de nascimento: ");
        int year = scanner.nextInt();
        int age = baseYear - year;
        System.out.printf("Olá %s! Você tem %s anos.\n", name, age);

        scanner.close();
    }
}
