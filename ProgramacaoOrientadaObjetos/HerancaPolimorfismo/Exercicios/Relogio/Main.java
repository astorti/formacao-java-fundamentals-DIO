package ProgramacaoOrientadaObjetos.HerancaPolimorfismo.Exercicios.Relogio;

public class Main {

    public static void main(String[] args) {

        Relogio brRelogio = new BRRelogio();
        brRelogio.setSegundo(0);
        brRelogio.setMinuto(0);
        brRelogio.setHora(15);  

        System.out.println(brRelogio.getTime());
        System.out.println(new USRelogio().convert(brRelogio).getTime());
    }

}
