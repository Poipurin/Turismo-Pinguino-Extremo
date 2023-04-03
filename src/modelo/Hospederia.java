package modelo;

public class Hospederia extends MedioDeAlojamiento{
    private int capacidad;
    private boolean esFumador;

    public Hospederia(int valorBaseNoche, int cantidadDeNoches, DatosCliente datosCliente, String tipoTemporada, int cantidadDePersonas, int capacidad, boolean esFumador) {
        super(valorBaseNoche, cantidadDeNoches, datosCliente, tipoTemporada, cantidadDePersonas);
        this.capacidad = capacidad;
        this.esFumador = esFumador;
    }

    public Hospederia(int capacidad, boolean esFumador) {
        this.capacidad = capacidad;
        this.esFumador = esFumador;
    }

    public Hospederia() {
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEsFumador() {
        return esFumador;
    }

    public void setEsFumador(boolean esFumador) {
        this.esFumador = esFumador;
    }
}
