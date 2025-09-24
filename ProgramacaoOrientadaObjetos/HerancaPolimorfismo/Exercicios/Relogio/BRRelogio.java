package ProgramacaoOrientadaObjetos.HerancaPolimorfismo.Exercicios.Relogio;

public non-sealed class BRRelogio extends Relogio{

    @Override
    public Relogio convert(final Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
        switch (relogio) {
            case USRelogio usRelogio -> this.hora = usRelogio.getAmPm().equals("PM") ? 
                                        usRelogio.getHora() + 12 : 
                                        usRelogio.getHora();
        
            case BRRelogio brRelogio -> this.hora = brRelogio.getHora();        
        }
        return this;
    }

}
