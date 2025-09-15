package BasicoJava.Fundamentos;

import java.util.Scanner;

public class PrimeiroPrograma {

    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();

        System.out.println("informe a sua idade");
        int age = scanner.nextInt();
        
        System.out.printf("Olá %s, você tem %s anos \n", name, age);

        scanner.close();
    }
}
