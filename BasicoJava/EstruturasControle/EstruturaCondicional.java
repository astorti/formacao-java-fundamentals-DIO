package BasicoJava.EstruturasControle;

import java.util.Scanner;

public class EstruturaCondicional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String name = scanner.next();
        System.out.print("Informe sua idade: ");
        int age = scanner.nextInt();
        boolean temHabilitacao = false;

        if (age >= 18) {
            System.out.print("Possui carteira de habilitação? (s/n) ");
            temHabilitacao = scanner.next().equalsIgnoreCase("s");
        }

        if (age >= 18 && temHabilitacao) {
            System.out.printf("%s, você tem %s anos e tem habilitação. Pode dirigir.\n", name, age);
        } else if(age >= 18 && !temHabilitacao){
            System.out.printf("%s, você tem %s anos mas não tem carteira de habilitação. Não pode dirigir.\n", name, age);
        } else {
            System.out.printf("%s, você tem %s anos. Não pode dirigir.\n", name, age);
        };

        scanner.close();
    }
}
