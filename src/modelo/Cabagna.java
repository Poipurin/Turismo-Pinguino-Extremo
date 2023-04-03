package modelo;

public class Cabagna extends Hospederia {
    private boolean conChimenea;

    public Cabagna(int valorBaseNoche, int cantidadDeNoches, DatosCliente datosCliente, String tipoTemporada, int cantidadDePersonas, int capacidad, boolean esFumador, boolean conChimenea) {
        super(valorBaseNoche, cantidadDeNoches, datosCliente, tipoTemporada, cantidadDePersonas, capacidad, esFumador);
        this.conChimenea = conChimenea;
    }

    public Cabagna(boolean conChimenea) {
        this.conChimenea = conChimenea;
    }

    public Cabagna() {
    }

    public boolean isConChimenea() {
        return conChimenea;
    }

    public void setConChimenea(boolean conChimenea) {
        this.conChimenea = conChimenea;
    }
    public int incrementaValorBase(){
        return 0;
    }
}
