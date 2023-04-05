package modelo;

public class Carpa extends MedioDeAlojamiento{

    private int cantidadDePersonas;
    public Carpa(DatosCliente datosCliente, int valorBaseNoche, int cantidadDeNoches, String tipoTemporada, int cantidadDePersonas) {
        super(datosCliente,valorBaseNoche, cantidadDeNoches, tipoTemporada, cantidadDePersonas);
    }

    public Carpa() {
    }

    public int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    @Override
    public int valorACancelar() {
        return this.subtotal() - bonoDescuento();
    }
}
