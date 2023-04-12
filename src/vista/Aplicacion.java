package vista;

import controlador.Alojamiento;
import modelo.Cabagna;
import modelo.Carpa;
import modelo.DatosCliente;
import modelo.Hotel;

import java.util.ArrayList;

public class Aplicacion {
    public static void main(String[] args) {
        Alojamiento alojamiento = new Alojamiento(new ArrayList<>());

        Carpa carpa = new Carpa(new DatosCliente("Pepito", "12.345.236-0"), "Carpa", 2000, 5, "Temporada media", 2);
        alojamiento.ingresarCarpa(carpa);
        Cabagna cabagna = new Cabagna(new DatosCliente("Bárbara", "18.543.213-K"), "Cabaña", 10000, 5, "Temporada baja", 10, false, true);
        alojamiento.ingresarCabagna(cabagna);
        Hotel hotel = new Hotel(new DatosCliente("Sofi", "19.342.654-2"), "Hotel", 120000, 5, "Temporada baja", 3, true, true);
        alojamiento.ingresarHotel(hotel);

        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresar medio de alojamiento");
                    break;
                case 2:
                    if (alojamiento.getAlojamiento().size() == 0) {
                        System.out.println("No hay alojamientos registrados");
                    } else {
                        System.out.println(alojamiento.mostrarAlojamientos());
                    }
                    break;
                case 3:
                    if (alojamiento.getAlojamiento().size() == 0) {
                        System.out.println("No hay alojamientos registrados");
                    } else {
                        String rut;
                        rut = solicitarRut();
                        System.out.println(alojamiento.datosCliente(rut));
                    }
                    break;
                case 4:
                    if (alojamiento.getAlojamiento().size() == 0) {
                        System.out.println("No hay clientes registrados en el hotel");
                    } else {

                        System.out.println("El Hotel tiene un total adicional de: $" + alojamiento.totalAdicional());
                    }
                    break;
                case 5:
                    System.out.println("Total bono descuento");
                    break;
                case 6:
                    System.out.println("Cantidad medios de alojamiento");
                    break;
                case 7:
                    System.out.println("Valor a cancelar por el cliente");
                    break;
                case 8:
                    if (alojamiento.getAlojamiento().size() == 0) {
                        System.out.println("No hay alojamientos registrados");
                    } else {
                        System.out.println(alojamiento.incrementoValorBase());
                    }
                    break;
            }
        }
        while (opcion != 9);

    }

    public static int menu() {
        System.out.println("○○○○○○○○○○○○○○ Turismo el pingüino extremo ○○○○○○○○○○○○○○");
        System.out.println("1.- Ingresar medio de alojamiento");
        System.out.println("2.- Mostrar medios de alojamiento ");
        System.out.println("3.- Datos del cliente");
        System.out.println("4.- Total adicional");
        System.out.println("5.- Total bono descuento");
        System.out.println("6.- Cantidad de medios de alojamiento");
        System.out.println("7.- Valor a cancelar por el cliente");
        System.out.println("8.- Aplicar incremento valor base");
        System.out.println("9.- Salir");
        System.out.println("Ingrese opción para continuar");
        return Leer.datoInt();
    }

    public static String solicitarRut() {
        System.out.println("Ingrese rut Ejemplo formato: 55.555.555-5");
        return Leer.dato();
    }
}

