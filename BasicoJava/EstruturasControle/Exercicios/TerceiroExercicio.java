// Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;
package BasicoJava.EstruturasControle.Exercicios;

import java.util.Scanner;

public class TerceiroExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Informe outro número: ");
        int numero2 = scanner.nextInt();

        while (numero2 <= numero1) {
            System.out.println("O número deve ser maior que o primeiro número ");
            System.out.print("Informe outro número: ");
            numero2 = scanner.nextInt();
        }

        System.out.println("Escolha a opção");
        System.out.println("1 -> Impar");
        System.out.println("2 -> Par");
        int option = scanner.nextInt();

        for (int i = numero2; i >= numero1; i--) {
            int result = i % 2;
            if (option == 1) {
                if (result != 0) {
                    System.out.println(i);
                }
            } else {
                if (result == 0) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
