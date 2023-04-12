package modelo;

public class Cabagna extends Hospederia {
    private boolean conChimenea;

    public Cabagna(DatosCliente datosCliente, String tipoAlojamiento, int valorBaseNoche, int cantidadDeNoches, String tipoTemporada, int capacidad, boolean esFumador, boolean conChimenea) {
        super(datosCliente, tipoAlojamiento, valorBaseNoche, cantidadDeNoches,  tipoTemporada, capacidad, esFumador);
        this.conChimenea = conChimenea;
    }

    public Cabagna() {
    }

    public boolean getConChimenea() {
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
