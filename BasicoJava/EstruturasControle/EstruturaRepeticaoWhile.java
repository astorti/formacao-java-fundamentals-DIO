package BasicoJava.EstruturasControle;

import java.util.Scanner;

public class EstruturaRepeticaoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";
        while(!name.equalsIgnoreCase("exit")){
            System.out.print("Informe um nome ou 'exit' para sair: ");
            name = scanner.next();
        };

        scanner.close();
    }
}
