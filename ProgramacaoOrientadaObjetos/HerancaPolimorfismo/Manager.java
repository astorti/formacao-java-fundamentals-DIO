package ProgramacaoOrientadaObjetos.HerancaPolimorfismo;

public non-sealed class Manager extends Employee{

    private String department;

    public Manager(){}

    public Manager( String code,
                    String name,
                    String adress,
                    int age,
                    double salary,
                    String department) {
        super(code, name, adress, age, salary);
        this.department = department;
    }

    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getCode() {
        return "MN" + this.code;
    }
}
