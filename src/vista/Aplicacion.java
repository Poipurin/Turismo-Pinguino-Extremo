package vista;

import modelo.Cabagna;
import modelo.DatosCliente;
import modelo.MedioDeAlojamiento;

public class Aplicacion {
    public static void main(String[] args) {
        Cabagna cabagna = new Cabagna(new DatosCliente("Bárbara", "18.543.213-K"),10000,5,"Temporada baja",10,10,false,true);
        System.out.println("El subtotal a pagar por la cabaña es de: $"+cabagna.subtotal());
        System.out.println("El incremento en el valor base es de: $"+cabagna.incrementaValorBase());
        System.out.println("El bono descuento por temporada es de: $"+cabagna.bonoDescuento());
        System.out.println("El valor total a cancelar por la cabaña es de: $"+cabagna.valorACancelar());

    }

}