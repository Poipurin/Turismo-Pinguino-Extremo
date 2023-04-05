package vista;

import modelo.Cabagna;
import modelo.DatosCliente;
import modelo.MedioDeAlojamiento;

public class Aplicacion {
    public static void main(String[] args) {
        Cabagna cabagna = new Cabagna(new DatosCliente("Bárbara", "18.543.213-K"),10000,5,"Temporada alta",2,5,false,true);
        System.out.println("Cabaña alta: $"+cabagna.bonoDescuento());

    }

}