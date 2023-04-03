package modelo;

public class Carpa extends MedioDeAlojamiento{

    private int cantidadDePersonas;
    public Carpa(int valorBaseNoche, int cantidadDeNoches, DatosCliente datosCliente, String tipoTemporada, int cantidadDePersonas) {
        super(valorBaseNoche, cantidadDeNoches, datosCliente, tipoTemporada, cantidadDePersonas);
    }

    public Carpa() {
    }

    public int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }
}
