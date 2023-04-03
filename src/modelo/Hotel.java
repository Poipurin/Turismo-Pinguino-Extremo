package modelo;

public class Hotel extends Hospederia{
    private boolean conDesayuno;

    public Hotel(int valorBaseNoche, int cantidadDeNoches, DatosCliente datosCliente, String tipoTemporada, int cantidadDePersonas, int capacidad, boolean esFumador, boolean conDesayuno) {
        super(valorBaseNoche, cantidadDeNoches, datosCliente, tipoTemporada, cantidadDePersonas, capacidad, esFumador);
        this.conDesayuno = conDesayuno;
    }

    public Hotel(boolean conDesayuno) {
        this.conDesayuno = conDesayuno;
    }

    public Hotel() {
    }

    public boolean isConDesayuno() {
        return conDesayuno;
    }

    public void setConDesayuno(boolean conDesayuno) {
        this.conDesayuno = conDesayuno;
    }
}
