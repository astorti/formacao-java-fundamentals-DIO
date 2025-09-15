package BasicoJava.Fundamentos;

import java.util.Scanner;

public class OperadoresAtribuicaoLogicos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto é 2 + 2?");
        int result = scanner.nextInt();
        boolean isRight = result == 4;
        System.out.printf("O resultado é 4, você acertou? (%s) \n", isRight);

        int valor = 5;
        isRight = valor != result;
        System.out.printf("%s é diferente de %s? (%s) \n", valor, result, isRight);

        isRight = valor != result;
        System.out.printf("%s é igual a %s? (%s) \n", valor, result, !isRight);

        System.out.println("-------------");

        System.out.println("Qual é a sua idade?");
        int age = scanner.nextInt();
        boolean canDrive = age > 17;
        System.out.printf("Você pode dirigir? (%s) \n", canDrive);
        System.out.printf("Você não pode dirigir? (%s) \n", !canDrive);

        scanner.close();
    }
}
