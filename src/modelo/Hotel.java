package modelo;

public class Hotel extends Hospederia{
    private boolean conDesayuno;

    public Hotel(DatosCliente datosCliente,String tipoAlojamiento, int valorBaseNoche, int cantidadDeNoches, String tipoTemporada, int capacidad, boolean esFumador, boolean conDesayuno) {
        super(datosCliente,tipoAlojamiento,valorBaseNoche, cantidadDeNoches, tipoTemporada, capacidad, esFumador);
        this.conDesayuno = conDesayuno;
    }

    public Hotel() {
    }
    public boolean getConDesayuno() {
        return conDesayuno;
    }

    public void setConDesayuno(boolean conDesayuno) {
        this.conDesayuno = conDesayuno;
    }

    public int adicional(){

        int adicional=0;
        if(this.getEsFumador() == true && this.getConDesayuno() == true){
            adicional=Math.round(this.subtotal()*30/100);
        }
        return adicional;
    }
    @Override
    public int valorACancelar() {
        return (this.subtotal() + this.adicional()) - this.bonoDescuento() ;
    }
}
