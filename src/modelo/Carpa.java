package modelo;

public class Carpa extends MedioDeAlojamiento{

    private int cantidadPersonas;
    public Carpa(DatosCliente datosCliente, int valorBaseNoche, int cantidadDeNoches, String tipoTemporada, int cantidadPersonas) {
        super(datosCliente,valorBaseNoche, cantidadDeNoches, tipoTemporada);
        this.cantidadPersonas = cantidadPersonas;
    }

    public Carpa() {
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public int valorACancelar() {
        return this.subtotal() - bonoDescuento();
    }
}
