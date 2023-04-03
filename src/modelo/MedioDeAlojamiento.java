package modelo;

public class MedioDeAlojamiento {
    private int valorBaseNoche;
    private int cantidadDeNoches;
    private DatosCliente datosCliente;
    private String tipoTemporada;
    private int cantidadDePersonas;

    public MedioDeAlojamiento(int valorBaseNoche, int cantidadDeNoches, DatosCliente datosCliente, String tipoTemporada, int cantidadDePersonas) {
        this.valorBaseNoche = valorBaseNoche;
        this.cantidadDeNoches = cantidadDeNoches;
        this.datosCliente = datosCliente;
        this.tipoTemporada = tipoTemporada;
    }

    public MedioDeAlojamiento() {
    }

    public int getValorBaseNoche() {
        return valorBaseNoche;
    }

    public void setValorBaseNoche(int valorBaseNoche) {
        this.valorBaseNoche = valorBaseNoche;
    }

    public int getCantidadDeNoches() {
        return cantidadDeNoches;
    }

    public void setCantidadDeNoches(int cantidadDeNoches) {
        this.cantidadDeNoches = cantidadDeNoches;
    }

    public DatosCliente getDatosCliente() {
        return datosCliente;
    }

    public void setDatosCliente(DatosCliente datosCliente) {
        this.datosCliente = datosCliente;
    }

    public String getTipoTemporada() {
        return tipoTemporada;
    }

    public void setTipoTemporada(String tipoTemporada) {
        this.tipoTemporada = tipoTemporada;
    }

}
