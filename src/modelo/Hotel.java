package modelo;

public class Hotel extends Hospederia{
    private boolean conDesayuno;

    public Hotel(DatosCliente datosCliente, int valorBaseNoche, int cantidadDeNoches, String tipoTemporada, int cantidadDePersonas, int capacidad, boolean esFumador, boolean conDesayuno) {
        super(datosCliente,valorBaseNoche, cantidadDeNoches, tipoTemporada, cantidadDePersonas, capacidad, esFumador);
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
        if(this.getEsFumador() == true || this.getConDesayuno() == true){
            adicional=Math.round(this.subtotal()*30/100);
        }
        return adicional;
    }
    @Override
    public int valorACancelar() {
        return (this.subtotal() + this.adicional()) - this.bonoDescuento() ;
    }
}
