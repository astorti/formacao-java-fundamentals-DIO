package ProgramacaoOrientadaObjetos.HerancaPolimorfismo.Exercicios.Relogio;

public non-sealed class USRelogio extends Relogio{

    private String amPm;

    public String getAmPm() {
        return amPm;
    }

    public void setAposMeioDia() {
        this.amPm = "PM";
    }

    public void setAntesMeioDia() {
        this.amPm = "AM";
    }

    public void setHora(int hora) {
        setAntesMeioDia();
        if((hora > 12) && (hora <= 23)) {
            this.hora = hora - 12;
            setAposMeioDia();
            return;
        } else if (hora >= 24) {
            this.hora = 0;
        } else {
            this.hora = hora;
        }
    }

    @Override
    public Relogio convert(Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
        switch (relogio) {
            case USRelogio usRelogio -> {
                this.hora = usRelogio.getHora();
                this.amPm = usRelogio.getAmPm();}
            case BRRelogio brRelogio -> this.setHora(brRelogio.getHora());        
        }
        return this;
    }

    @Override
    public String getTime(){
        return super.getTime() + " " + this.amPm;
    }

}
