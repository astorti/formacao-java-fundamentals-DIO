package BasicoJava.EstruturasControle;

import java.util.Scanner;

public class EstruturaRepeticaoDoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";
        do {
            System.out.print("Informe um nome ou 'exit' para sair: ");
            name = scanner.next();
        } while (!name.equalsIgnoreCase("exit"));

        scanner.close();
    }
}
