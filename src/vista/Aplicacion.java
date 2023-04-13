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
        String rutCliente;

        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    rutCliente = solicitarRut();
                    if (alojamiento.buscarCliente(rutCliente) == -1) {
                        System.out.println("Ingrese su nombre");
                        String nombre = Leer.dato();

                        System.out.println("Ingrese el valor base por noche");
                        int valorBaseNoche = Leer.datoInt();

                        System.out.println("Ingrese cantidad de noches a reservar");
                        int cantidadDeNoches = Leer.datoInt();

                        String tipoTemporada;
                        do {
                            System.out.println("Ingrese la temporada correspondiente (Temporada baja, temporada media o temporada alta)");
                            tipoTemporada = Leer.dato();
                        } while (tipoTemporada.compareToIgnoreCase("Temporada baja") != 0 &&
                                tipoTemporada.compareToIgnoreCase("Temporada media") != 0 &&
                                tipoTemporada.compareToIgnoreCase("Temporada alta") != 0);

                        int respuesta;
                        do {
                            System.out.println("El tipo de alojamiento es:   1) Carpa    2)Cabaña      3)Hotel");
                            System.out.println("Ingrese opción para continuar");
                            respuesta = Leer.datoInt();
                        } while (respuesta < 1 || respuesta > 3);

                        if (respuesta == 1) {
                            String tipoAlojamiento = "Carpa";
                            System.out.println("Ingrese la cantidad de personas");
                            int cantidadPersonas = Leer.datoInt();
                            alojamiento.ingresarCarpa(new Carpa(new DatosCliente(nombre, rutCliente), tipoAlojamiento, valorBaseNoche, cantidadDeNoches, tipoTemporada, cantidadPersonas));
                            System.out.println("Se ingresa reserva en carpa con éxito");
                        } else {
                            System.out.println("Ingrese capacidad");
                            int capacidad = Leer.datoInt();

                            int fumador;
                            boolean esFumador = false;
                            do {
                                System.out.println("¿El cliente es fumador? 1) Sí  2) No");
                                System.out.println("Ingrese opción para continuar");
                                fumador = Leer.datoInt();
                                switch (fumador) {
                                    case 1:
                                        esFumador = true;
                                        break;
                                    case 2:
                                        esFumador = false;
                                        break;
                                }
                            } while (fumador < 0 || fumador > 2);

                            if (respuesta == 2) {
                                String tipoAlojamiento = "Cabaña";
                                int chimenea;
                                boolean conChimenea = false;
                                do {
                                    System.out.println("¿El cliente desea reservar una cabaña con chimenea? 1) Sí  2) No");
                                    System.out.println("Ingrese opción para continuar");
                                    chimenea = Leer.datoInt();
                                    switch (chimenea) {
                                        case 1:
                                            conChimenea = true;
                                            break;
                                        case 2:
                                            conChimenea = false;
                                            break;
                                    }
                                } while (chimenea < 0 || chimenea > 2);
                                alojamiento.ingresarCabagna(new Cabagna(new DatosCliente(nombre, rutCliente), tipoAlojamiento, valorBaseNoche, cantidadDeNoches, tipoTemporada, capacidad, esFumador, conChimenea));
                                System.out.println("Se ingresa reserva en cabaña con éxito");
                            } else {

                                String tipoAlojamiento = "Hotel";
                                int desayuno;
                                boolean conDesayuno = false;
                                do {
                                    System.out.println("¿El cliente desea servicio de desayuno? 1) Sí  2) No");
                                    System.out.println("Ingrese opción para continuar");
                                    desayuno = Leer.datoInt();
                                    switch (desayuno) {
                                        case 1:
                                            conDesayuno = true;
                                            break;
                                        case 2:
                                            conDesayuno = false;
                                            break;
                                    }
                                } while (desayuno < 0 || desayuno > 2);
                                alojamiento.ingresarHotel(new Hotel(new DatosCliente(nombre,rutCliente),tipoAlojamiento,valorBaseNoche,cantidadDeNoches,tipoTemporada,capacidad,esFumador,conDesayuno));
                                System.out.println("Se ingresa reserva en hotel con éxito");
                            }
                        }
                    } else {
                        System.out.println("El cliente " + rutCliente + " ya está registrado");
                    }

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
                        System.out.println("No hay alojamientos registrados");
                    } else {

                        System.out.println("El Hotel tiene un total adicional de: $" + alojamiento.totalAdicional());
                    }
                    break;
                case 5:
                    if (alojamiento.getAlojamiento().size() == 0) {
                        System.out.println("No hay alojamientos registrados");
                    } else {

                        System.out.println("El total del bono descuento es de de: $" + alojamiento.totalBonoDescuento());
                    }
                    break;
                case 6:
                    if (alojamiento.getAlojamiento().size() == 0) {
                        System.out.println("No hay alojamientos registrados");
                    } else {

                        System.out.println(alojamiento.cantidadMediosAlojamiento());
                    }
                    break;
                case 7:
                    if (alojamiento.getAlojamiento().size() == 0) {
                        System.out.println("No hay alojamientos registrados");
                    } else {
                        String rut;
                        rut = solicitarRut();
                        System.out.println(alojamiento.valorACancelar(rut));
                    }
                    break;
                case 8:
                    if (alojamiento.getAlojamiento().size() == 0) {
                        System.out.println("No hay alojamientos registrados");
                    } else {
                        String rut;
                        rut = solicitarRut();
                        System.out.println(alojamiento.incrementoValorBase(rut));
                    }
                    break;
            }
        }
        while (opcion != 9);

    }

    public static int menu() {
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⠛⠛⠛⠛⠷⣶⣤⣀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠟⠁⠈⢳⡀⢀⣠⣴⡿⠿⠛⠁⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡞⠁⠀⠀⠀⠀⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠀⢀⣠⣤⣄⢸⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠁⠀⣾⠋⠈⠹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢸⡏⠀⠀⢻⡆⠀⠀⢹⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⢸⡇⠀⠀⠈⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⢸⣇⠀⠀⠀⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⢸⣿⠀⠀⢠⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠸⣷⠀⠀⠈⣿⠀⢀⣾⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡀⠀⠀⠻⢶⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⢀⣤⡾⠃⠀⠀⠀⠈⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⢠⣶⣯⣤⣤⣤⣤⡴⠶⠶⣼⣿⣿⣷⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀");
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

