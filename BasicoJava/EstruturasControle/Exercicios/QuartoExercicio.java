// Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de  0 na divisão, números menores que o primeiro número devem ser ignorados
package BasicoJava.EstruturasControle.Exercicios;

import java.util.Scanner;

public class QuartoExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int number = scanner.nextInt();
        boolean keepVerify = true;

        while (keepVerify) {
            System.out.print("Informe o número para verificação: ");
            int verify = scanner.nextInt();

            if(verify < number) {
                System.out.println("==================================");
                System.out.printf("Informe um número maior que %s\n", number);
                System.out.println("==================================");
                continue;
            }

            int result = verify % number;
            keepVerify = result == 0;
            System.out.printf("%s %% %s = %s\n", verify, number, result);
        }

        scanner.close();
    }
}
