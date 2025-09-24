package ProgramacaoOrientadaObjetos.HerancaPolimorfismo.Exercicios.Cinema;

public class Ingresso{

    private double valor;
    private String nomeFilme;
    private String dubladoLegendado;
    private String tipoIngresso;

    public Ingresso(double valor, String nomeFilme, String dubladoLegendado, String tipoIngresso) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dubladoLegendado = dubladoLegendado;
        this.tipoIngresso = tipoIngresso;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getDubladoLegendado() {
        return dubladoLegendado;
    }

    public void setDubladoLegendado(String dubladoLegendado) {
        this.dubladoLegendado = dubladoLegendado;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public void imprimirRecibo() {
        System.out.println("======= RECIBO =======");
        System.out.println("Filme: " + nomeFilme + " - " + dubladoLegendado);
        System.out.println("Ingresso: " + tipoIngresso);
        System.out.println("Valor: R$ " + valor);
        System.out.println("----------------------");
    }
}
