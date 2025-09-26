package ProgramacaoOrientadaObjetos.Interfaces.Exercicios.Imposto.Classes;

public class Produto {

    private double valor;
    private String tipoProduto;

    public Produto(double valor, String tipoProduto){
        this.valor = valor;
        this.tipoProduto = tipoProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
}
