package vista;

import modelo.Cabagna;
import modelo.Carpa;
import modelo.DatosCliente;
import modelo.MedioDeAlojamiento;

public class Aplicacion {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Opción Cabaña");
        System.out.println(" ");
        Cabagna cabagna = new Cabagna(new DatosCliente("Bárbara", "18.543.213-K"),10000,5,"Temporada baja",10,10,false,true);
        System.out.println("El subtotal a pagar por la cabaña es de: $"+cabagna.subtotal());
        System.out.println("El incremento en el valor base es de: $"+cabagna.incrementaValorBase());
        System.out.println("El bono descuento por temporada es de: $"+cabagna.bonoDescuento());
        System.out.println("El valor total a cancelar por la cabaña es de: $"+cabagna.valorACancelar());
        System.out.println(" ");
        System.out.println("Opción Carpa");
        System.out.println(" ");
        Carpa carpa = new Carpa(new DatosCliente("Pepito","12.345.236-0"),2000,5,"Temporada media",3);
        System.out.println("El subtotal a pagar por la carpa es de: $"+carpa.subtotal());
        System.out.println("El bono descuento por temporada es de: $"+carpa.bonoDescuento());
        System.out.println("El valor total a cancelar por la carpa es de: $"+carpa.valorACancelar());
    }


}