package ProgramacaoOrientadaObjetos.HerancaPolimorfismo.Exercicios.Cinema;

public class MeiaEntrada extends Ingresso{

    private int desconto;
    private double valorMeiaEntrada;
    
    public MeiaEntrada(double valor, String nomeFilme, String dubladoLegendado, String tipoIngresso, int desconto) {
        super(valor, nomeFilme, dubladoLegendado, tipoIngresso);
        this.desconto = desconto;
    }

    public int getDesconto(){
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public double getValorMeiaEntrada(){
        return valorMeiaEntrada;
    }

    public void setValorMeiaEntrada(double valorMeiaEntrada) {
        this.valorMeiaEntrada = valorMeiaEntrada;
    }
    
    public void calcularMeiaEntrada(double valor){
        setValorMeiaEntrada(valor * desconto / 100);
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("======= RECIBO =======");
        System.out.println("Filme: " + getNomeFilme() + " - " + getDubladoLegendado());
        System.out.println("Ingresso: " + getTipoIngresso());
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Desconto: " + desconto + "%");
        System.out.printf("Valor final: R$ %s \n", valorMeiaEntrada);
        System.out.println("----------------------");
    }
}
