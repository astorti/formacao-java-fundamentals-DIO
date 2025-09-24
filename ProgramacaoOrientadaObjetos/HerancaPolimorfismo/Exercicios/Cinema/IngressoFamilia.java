package ProgramacaoOrientadaObjetos.HerancaPolimorfismo.Exercicios.Cinema;

public class IngressoFamilia extends Ingresso{

    private int quantidadePessoasFamilia;
    private int descontoIngressoFamilia;
    private double valorIngressoFamilia;

    public IngressoFamilia(double valor, String nomeFilme, String dubladoLegendado, String tipoIngresso, int quantidadePessoasFamilia, int descontoIngressoFamilia) {
        super(valor, nomeFilme, dubladoLegendado, tipoIngresso);
        this.quantidadePessoasFamilia = quantidadePessoasFamilia;
        this.descontoIngressoFamilia = descontoIngressoFamilia;
    }

    public int getQuantidadePessoasFamilia() {
        return quantidadePessoasFamilia;
    }

    public void setQuantidadePessoasFamilia(int quantidadePessoasFamilia) {
        this.quantidadePessoasFamilia = quantidadePessoasFamilia;
    }

    public int getDescontoIngressoFamilia() {
        return descontoIngressoFamilia;
    }

    public void setDescontoIngressoFamilia(int descontoIngressoFamilia) {
        this.descontoIngressoFamilia = descontoIngressoFamilia;
    }

    public double getValorIngressoFamilia() {
        return valorIngressoFamilia;
    }

    public void setValorIngressoFamilia(double valorIngressoFamilia) {
        this.valorIngressoFamilia = valorIngressoFamilia;
    }

    public void calcularDescontoIngressoFamilia(double valor, int quantidadePessoasFamilia, int descontoIngressoFamilia) {
        setValorIngressoFamilia(valor * quantidadePessoasFamilia);
        if(quantidadePessoasFamilia > 3) {
            setValorIngressoFamilia(valorIngressoFamilia - valorIngressoFamilia * descontoIngressoFamilia / 100);
        } 
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("======= RECIBO =======");
        System.out.println("Filme: " + getNomeFilme() + " - " + getDubladoLegendado());
        System.out.println("Ingresso: " + getTipoIngresso());
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Nº Pessoas: " + quantidadePessoasFamilia);
        if(quantidadePessoasFamilia > 3) {
            System.out.println("Desconto: " + descontoIngressoFamilia + "%");
        }
        System.out.printf("Valor final: R$ %s \n", valorIngressoFamilia);
        System.out.println("----------------------");
    }
}
