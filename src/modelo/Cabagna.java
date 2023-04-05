package modelo;

public class Cabagna extends Hospederia {
    private boolean conChimenea;

    public Cabagna(DatosCliente datosCliente, int valorBaseNoche, int cantidadDeNoches, String tipoTemporada, int cantidadDePersonas, int capacidad, boolean esFumador, boolean conChimenea) {
        super(datosCliente, valorBaseNoche, cantidadDeNoches,  tipoTemporada, cantidadDePersonas, capacidad, esFumador);
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

        int incrementaValorBase = 0;
        if(this.getCapacidad() > 5){
            incrementaValorBase = this.getValorBaseNoche() * 18/100;
            return incrementaValorBase;

        }
        return incrementaValorBase;

    }
    @Override
    public int valorACancelar() {
        return (this.subtotal() + incrementaValorBase()) - this.bonoDescuento() ;
    }

}
