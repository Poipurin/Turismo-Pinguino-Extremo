package vista;

import modelo.*;

public class smoke_test {
    public static void smoke_test(String[] args) {
        System.out.println(" ");
        System.out.println("Opción Cabaña");
        System.out.println(" ");
        Cabagna cabagna = new Cabagna(new DatosCliente("Bárbara", "18.543.213-K"),"Cabaña",10000,5,"Temporada baja",10,false,true);
        System.out.println("El subtotal a pagar por la cabaña es de: $"+cabagna.subtotal());
        System.out.println("El incremento en el valor base es de: $"+cabagna.incrementaValorBase());
        System.out.println("El bono descuento por temporada es de: $"+cabagna.bonoDescuento());
        System.out.println("El valor total a cancelar por la cabaña es de: $"+cabagna.valorACancelar());
        System.out.println(" ");
        System.out.println("Opción Carpa");
        System.out.println(" ");
        Carpa carpa = new Carpa(new DatosCliente("Pepito","12.345.236-0"),"Carpa",2000,5,"Temporada media",3);
        System.out.println("El subtotal a pagar por la carpa es de: $"+carpa.subtotal());
        System.out.println("El bono descuento por temporada es de: $"+carpa.bonoDescuento());
        System.out.println("El valor total a cancelar por la carpa es de: $"+carpa.valorACancelar());
        System.out.println(" ");
        System.out.println("Opción Hotel");
        System.out.println(" ");
        Hotel hotel = new Hotel(new DatosCliente("Sofi", "19.342.654-2"),"Hotel",120000,5,"Temporada baja",3,false,true);
        System.out.println("El subtotal a pagar por el hotel es de: $"+hotel.subtotal());
        System.out.println("El valor adicional por habitación de fumador y servicio de desayuno es: $"+hotel.adicional());
        System.out.println("El bono descuento por temporada es de: $"+hotel.bonoDescuento());
        System.out.println("El valor total a cancelar por el hospedaje en el hotel es de: $"+hotel.valorACancelar());
    }
}