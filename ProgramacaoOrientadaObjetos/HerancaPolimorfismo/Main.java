package ProgramacaoOrientadaObjetos.HerancaPolimorfismo;

public class Main {

    public static void main(String[] args) {

        printEmployee(new Manager());
        printEmployee(new Seller());
    }

    public static void printEmployee(Employee employee) {

        if(employee instanceof Manager manager) {

            employee.setName("John");
            manager.setDepartment("vendas");
            manager.setCode("123");
            
            System.out.println(manager.getCode());
            System.out.printf("%s, gerente de %s. \n", employee.getName(), manager.getDepartment());   
        }

        if(employee instanceof Seller seller) {

            employee.setName("James");
            seller.setPercentagePerSale(5);
            seller.setCode("456");
            
            System.out.println(seller.getCode());
            System.out.printf("%s, porcentagem sobre venda: %s. \n", employee.getName(), seller.getPercentagePerSale());   
        }
    }
}
