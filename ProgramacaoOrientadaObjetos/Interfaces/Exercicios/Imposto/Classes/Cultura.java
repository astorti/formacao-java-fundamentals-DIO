package ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Imposto.Classes;

import ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Imposto.Interfaces.Imposto;

public class Cultura extends Produto implements Imposto{

    public Cultura(double valor, String tipoProduto) {
        super(valor, tipoProduto);
    }

    @Override
    public double calcularImposto(double imposto) {
        System.out.println("======= Recibo =======");
        System.out.println("Tipo do produto: " + getTipoProduto());
        System.out.println("Valor do produto: " + getValor());
        double valorImposto = getValor() * imposto / 100;
        System.out.printf("Taxa de imposto: %s%% (R$ %s) \n", imposto, valorImposto);
        double valorTotal = getValor() + valorImposto;
        return valorTotal;
    }

}
