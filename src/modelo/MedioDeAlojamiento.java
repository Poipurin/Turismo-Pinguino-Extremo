package modelo;

public abstract class MedioDeAlojamiento {

    private DatosCliente datosCliente;
    private String tipoAlojamiento;
    private int valorBaseNoche;
    private int cantidadDeNoches;
    private String tipoTemporada;


    public MedioDeAlojamiento(DatosCliente datosCliente, String tipoAlojamiento, int valorBaseNoche, int cantidadDeNoches, String tipoTemporada) {
        this.datosCliente = datosCliente;
        this.tipoAlojamiento = tipoAlojamiento;
        this.valorBaseNoche = valorBaseNoche;
        this.cantidadDeNoches = cantidadDeNoches;
        this.tipoTemporada = tipoTemporada;
    }

    public MedioDeAlojamiento() {
    }
    public DatosCliente getDatosCliente() {
        return datosCliente;
    }

    public void setDatosCliente(DatosCliente datosCliente) {
        this.datosCliente = datosCliente;
    }
    public String getTipoAlojamiento(){return tipoAlojamiento;}
    public void setTipoAlojamiento(String tipoAlojamiento) { this.tipoAlojamiento = tipoAlojamiento;}
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

    public String getTipoTemporada() {
        return tipoTemporada;
    }

    public void setTipoTemporada(String tipoTemporada) {
        this.tipoTemporada = tipoTemporada;
    }
    //•	subtotal: devolverá el subtotal a cancelar el cual será cantidad de noches por el valorBaseNoche
    public int subtotal(){
        return (this.getCantidadDeNoches()*this.getValorBaseNoche());
    }
    //•	bonoDescuento: devolverá el valor a descontar sabiendo que es un 25% del subTotal si el tipo
    // de temporada es baja o es de un 12.5% si el tipo Temporada es media.

    public int bonoDescuento(){
        int bonoDescuento = 0;

        switch(this.getTipoTemporada().toLowerCase()){
            case "temporada baja":
                bonoDescuento = Math.round(this.subtotal()*25/100);
                break;
            case "temporada media":
                bonoDescuento = (int)Math.round(this.subtotal()*12.5/100);
                break;
            default:
                break;
        }
        return bonoDescuento;
    }
    public abstract int valorACancelar();
}
