package ProgramacaoOrientadaObjetos.HerancaPolimorfismo.Exercicios.Cinema;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Comprar Ingresso ===");
        System.out.print("Informar o nome do filme: ");
        String filme = scanner.nextLine();

        System.out.print("Dublado ou Legendado (d/l): ");
        String dubladoOuLegendado = scanner.next();

        String dubladoLegendado = "escolher";
        switch (dubladoOuLegendado) {
            case "d":
                dubladoLegendado = "dublado";
                break;
            case "l": 
                dubladoLegendado = "legendado";
                break;
        }

        System.out.println("Informe o tipo de ingresso: ");
        System.out.println("1: Normal");
        System.out.println("2: Meia");
        System.out.println("3: Famila");
        int option = scanner.nextInt();

        String tipoIngresso = "Normal";
        switch (option) {
            case 1: 
                Ingresso normal = new Ingresso(20, filme, dubladoLegendado, tipoIngresso);
                normal.imprimirRecibo();
                break;
            case 2: 
                tipoIngresso = "Meia-Entrada";
                MeiaEntrada meia = new MeiaEntrada(20, filme, dubladoLegendado, tipoIngresso, 50);
                meia.calcularMeiaEntrada(meia.getValor());
                meia.imprimirRecibo();
                break;
            case 3: 
                tipoIngresso = "Famila";
                System.out.print("Informar a quantidade de pessoas na família: ");
                int tamanhoFamilia = scanner.nextInt();
                IngressoFamilia familia = new IngressoFamilia(20, filme, dubladoLegendado, tipoIngresso, tamanhoFamilia, 5);
                familia.calcularDescontoIngressoFamilia(familia.getValor(), tamanhoFamilia, familia.getDescontoIngressoFamilia());
                familia.imprimirRecibo();
                break;
        }
        scanner.close();
    }

}
