package BasicoJava.Fundamentos;

import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int value1 = scanner.nextInt();
        System.out.print("Informe o segundo numero: ");
        int value2 = scanner.nextInt();

        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);
        System.out.printf("%s - %s = %s\n", value1, value2, value1 - value2);
        System.out.printf("%s / %s = %s\n", value1, value2, value1 / value2);
        System.out.printf("%s * %s = %s\n", value1, value2, value1 * value2);
        System.out.printf("%s %% %s = %s\n", value1, value2, value1 % value2);

        System.out.println("--------------------");

        int value3 = 5 + 9 * 10 - 5 / 2;
        System.out.printf("%s \n", value3);
        value3 = 5 + (9 * 10) - (5 / 2);
        System.out.printf("%s \n", value3);
        value3 = (5 + 9) * (10 - 5) / 2;
        System.out.printf("%s \n", value3);
        value3 = value3 + 7;
        System.out.printf("%s \n", value3);
        value3 += 1;
        System.out.printf("%s \n", value3);

        value3 = 9;
        System.out.printf("A raiz quadrada de %s é %s\n", value3, Math.sqrt(value3));
        System.out.printf("A potência de %s é %s\n", value3, Math.pow(value3, 2));

        scanner.close();
    }
}
