package modelo;

public class Hotel extends Hospederia{
    private boolean conDesayuno;

    public Hotel(DatosCliente datosCliente, int valorBaseNoche, int cantidadDeNoches, String tipoTemporada, int cantidadDePersonas, int capacidad, boolean esFumador, boolean conDesayuno) {
        super(datosCliente,valorBaseNoche, cantidadDeNoches, tipoTemporada, cantidadDePersonas, capacidad, esFumador);
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

    public int adicional(){
        return 0;
    }
    @Override
    public int valorACancelar() {
        return 0;
    }
}
