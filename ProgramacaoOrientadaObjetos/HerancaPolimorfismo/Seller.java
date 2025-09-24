package ProgramacaoOrientadaObjetos.HerancaPolimorfismo;

public non-sealed class Seller extends Employee{

    private double percentagePerSale;

    public Seller(){}

    public Seller(  String code,
                    String name,
                    String adress,
                    int age,
                    double salary,
                    double percentagePerSale) {
        super(code, name, adress, age, salary);
        this.percentagePerSale = percentagePerSale;
    }

    public double getPercentagePerSale() {
        return percentagePerSale;
    }

    public void setPercentagePerSale(double percentagePerSale){
        this.percentagePerSale = percentagePerSale;
    }

    @Override
    public String getCode() {
        return "SL" + this.code;
    }
}
