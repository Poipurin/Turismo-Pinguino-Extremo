package vista;

import controlador.Alojamiento;

import java.util.ArrayList;

public class Aplicacion {
    public static void main(String[] args) {
        Alojamiento alojamiento = new Alojamiento(new ArrayList<>());

        int opcion;
        do{
            opcion = menu();
            switch (opcion){
                case 1:
                    System.out.println("Ingresar medio de alojamiento");
                    break;
                case 2:
                    System.out.println("Alojamientos");
                    break;
                case 3:
                    System.out.println("Datos cliente");
                    break;
                case 4:
                    System.out.println("Total adicional");
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
                    System.out.println("Aplicar incremento del valor base");
                    break;

            }
        }
        while(opcion !=9);

    }

    public static int menu(){
        System.out.println("******** Turismo el pingüino extremo ********");
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

}
