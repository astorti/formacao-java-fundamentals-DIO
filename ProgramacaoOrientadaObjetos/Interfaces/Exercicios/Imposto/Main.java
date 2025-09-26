package ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Imposto;

import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Imposto.Classes.Alimentacao;
import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Imposto.Classes.Cultura;
import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Imposto.Classes.Saude;
import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Imposto.Classes.Vestuario;

public class Main {

    public static void main(String[] args) {

        Cultura cultura = new Cultura(400, "Cultura");
        imprimirRecibo(cultura.calcularImposto(4));

        Vestuario vestuario = new Vestuario(200, "Vestuario");
        imprimirRecibo(vestuario.calcularImposto(2.5));

        Saude saude = new Saude(100, "Saúde");
        imprimirRecibo(saude.calcularImposto(1.5));

        Alimentacao alimentacao = new Alimentacao(50, "Alimentação");
        imprimirRecibo(alimentacao.calcularImposto(1));

    }

    public static void imprimirRecibo(double imposto) {
        System.out.println("Valor Total: R$ " + imposto);
    }
}
