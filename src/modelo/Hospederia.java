package modelo;

public abstract class Hospederia extends MedioDeAlojamiento{
    private int capacidad;
    private boolean esFumador;

    public Hospederia(DatosCliente datosCliente, int valorBaseNoche, int cantidadDeNoches, String tipoTemporada, int cantidadDePersonas, int capacidad, boolean esFumador) {
        super(datosCliente, valorBaseNoche, cantidadDeNoches, tipoTemporada, cantidadDePersonas);
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

    public boolean getEsFumador() {
        return esFumador;
    }

    public void setEsFumador(boolean esFumador) {
        this.esFumador = esFumador;
    }
}