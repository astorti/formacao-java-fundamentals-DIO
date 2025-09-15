// Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número
package BasicoJava.EstruturasControle.Exercicios;

import java.util.Scanner;

public class PrimeiroExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        System.out.printf("== Tabuada do número %s ==\n", number);

        for(int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%s x %s = %s \n", number, i, result);
        }

        scanner.close();
    }
}
