package controlador;

import modelo.Cabagna;
import modelo.Carpa;
import modelo.Hotel;
import modelo.MedioDeAlojamiento;

import java.util.ArrayList;

public class Alojamiento {
    private ArrayList<MedioDeAlojamiento> alojamiento;

    public Alojamiento(ArrayList<MedioDeAlojamiento> alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Alojamiento() {
    }

    public ArrayList<MedioDeAlojamiento> getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(ArrayList<MedioDeAlojamiento> alojamiento) {
        this.alojamiento = alojamiento;
    }

    public int buscarCliente(String rut) {
        String RutCliente = "";
        for (int i = 0; i < alojamiento.size(); i++) {
            if (alojamiento.get(i).getDatosCliente().getRut().compareToIgnoreCase(rut) == 0) {
                return i;
            }
        }
        return -1;
    }


    public void ingresarCarpa(Carpa carpa) {
        if (buscarCliente(carpa.getDatosCliente().getRut()) == -1) {
            alojamiento.add(carpa);
        }
    }

    public void ingresarCabagna(Cabagna cabagna) {
        if (buscarCliente(cabagna.getDatosCliente().getRut()) == -1) {
            alojamiento.add(cabagna);
        }
    }

    public void ingresarHotel(Hotel hotel) {
        if (buscarCliente(hotel.getDatosCliente().getRut()) == -1) {
            alojamiento.add(hotel);
        }
    }

    public String mostrarAlojamientos() {
        String mensaje = "";
        Carpa carpa = null;
        Cabagna cabagna = null;
        Hotel hotel = null;
        int contador = 0;
        for (int i = 0; i < alojamiento.size(); i++) {
            if (alojamiento.get(i) instanceof Carpa) {
                carpa = (Carpa) alojamiento.get(i);
                mensaje = mensaje + "\n El medio de alojamiento es: " + carpa.getTipoAlojamiento() + "\n Cliente: " + carpa.getDatosCliente().getNombre() + "\n Rut asociado al cliente: " + carpa.getDatosCliente().getRut() + "\n Valor base por noche: $" + carpa.getValorBaseNoche() + "\n Cantidad de noches: " + carpa.getCantidadDeNoches() + "\n Temporada: " + carpa.getTipoTemporada() + "\n Cantidad de personas: " + carpa.getCantidadPersonas() + "\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░";
                contador++;
            } else if (alojamiento.get(i) instanceof Cabagna) {
                cabagna = (Cabagna) alojamiento.get(i);
                mensaje = mensaje + "\n El medio de alojamiento es: " + cabagna.getTipoAlojamiento() + "\n Cliente: " + cabagna.getDatosCliente().getNombre() + "\n Rut asociado al cliente: " + cabagna.getDatosCliente().getRut() + "\n Valor base por noche: $" + cabagna.getValorBaseNoche() + "\n Cantidad de noches: " + cabagna.getCantidadDeNoches() + "\n Temporada: " + cabagna.getTipoTemporada() + "\n Capacidad: " + cabagna.getCapacidad() + "\n Es fumador: " + cabagna.getEsFumador() + "\n Con Chimenea: " + cabagna.getConChimenea() + "\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░";
                contador++;
            } else if (alojamiento.get(i) instanceof Hotel) {
                hotel = (Hotel) alojamiento.get(i);
                mensaje = mensaje + "\n El medio de alojamiento es: " + hotel.getTipoAlojamiento() + "\n Cliente: " + hotel.getDatosCliente().getNombre() + "\n Rut asociado al cliente: " + hotel.getDatosCliente().getRut() + "\n Valor base por noche: $" + hotel.getValorBaseNoche() + "\n Cantidad de noches: " + hotel.getCantidadDeNoches() + "\n Temporada: " + hotel.getTipoTemporada() + "\n Capacidad: " + hotel.getCapacidad() + "\n Es fumador: " + hotel.getEsFumador() + "\n Con desayuno: " + hotel.getConDesayuno() + "\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░";
                contador++;
            }
        }
        if (contador == 0)
            System.out.println("No hay alojamientos registrados");
        return mensaje;
    }

    public String datosCliente(String rut) {
        String mensaje = "";
        Carpa carpa = null;
        Cabagna cabagna = null;
        Hotel hotel = null;
        for (int i = 0; i < alojamiento.size(); i++) {
            if (alojamiento.get(i).getDatosCliente().getRut().compareToIgnoreCase(rut) == 0) {
                if (alojamiento.get(i) instanceof Carpa) {
                    carpa = (Carpa) alojamiento.get(i);
                    mensaje = "\n El rut: " + carpa.getDatosCliente().getRut() + "\n se encuentra asociado al cliente: " + carpa.getDatosCliente().getNombre()
                            + "\n El tipo de alojamiento del cliente es: " + carpa.getTipoAlojamiento() + "\n Su estadía es de: " + carpa.getCantidadDeNoches() + " noches" + "\n En temporada: " + carpa.getTipoTemporada() + "\n La cantidad de personas es: " + carpa.getCantidadPersonas() + "\n Con un valor base de:  $" + carpa.getValorBaseNoche() + " por noche"
                            + "\n El descuento por temporada es de : $" + carpa.bonoDescuento() + "\n El total a cancelar es de: $" + carpa.valorACancelar()  + "\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░";

                } else if (alojamiento.get(i) instanceof Cabagna) {
                    cabagna = (Cabagna) alojamiento.get(i);
                    mensaje = "\n El rut: " + cabagna.getDatosCliente().getRut() + "\n se encuentra asociado al cliente: " + cabagna.getDatosCliente().getNombre()
                            + "\n El tipo de alojamiento del cliente es: " + cabagna.getTipoAlojamiento() + "\n Su estadía es de: " + cabagna.getCantidadDeNoches() + " noches" + "\n En temporada: " + cabagna.getTipoTemporada() + "\n Con chimenea: " + cabagna.getConChimenea() + "\n Es fumador: " + cabagna.getEsFumador() + "\n Con un valor base de:  $" + cabagna.getValorBaseNoche() + " por noche"
                            + "\n El incremento del valor base por aumento de capacidad es de : $" + cabagna.incrementaValorBase() + "\n El descuento por temporada es de : $" + cabagna.bonoDescuento() + "\n El total a cancelar es de: $" + cabagna.valorACancelar() + "\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░";

                } else if (alojamiento.get(i) instanceof Hotel) {
                    hotel = (Hotel) alojamiento.get(i);
                    mensaje = "\n El cliente asociado al rut: " + hotel.getDatosCliente().getRut() + "\n se encuentra asociado al cliente: " + hotel.getDatosCliente().getNombre()
                            + "\n El tipo de alojamiento del cliente es: " + hotel.getTipoAlojamiento() + "\n Su estadía es de: " + hotel.getCantidadDeNoches() + " noches" + "\n En temporada: " + hotel.getTipoTemporada() + "\n Con desayuno: " + hotel.getConDesayuno() + "\n Es fumador: " + hotel.getEsFumador() + "\n Con un valor base de:  $" + hotel.getValorBaseNoche() + " por noche"
                            + "\n El costo adicional por desayuno y ser fumador es de : $" + hotel.adicional() + "\n El descuento por temporada es de : $" + hotel.bonoDescuento() + "\n El total a cancelar es de: $" + hotel.valorACancelar() + "\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░";
                }
                return mensaje;


            }


        }
        return "No hay clientes asociados a ese rut en Turismo Pingüino extremo";

    }


    /*public int totalAdicional(){
        int total = 0;
        Hotel hotel = null;
        for(int i=0; i < alojamiento.size();i++){
            if(alojamiento.get(i) instanceof Hotel){
                hotel = (Hotel) alojamiento.get(i);
                total = total + (hotel.adicional() * hotel.get);
            }
        } return total;
    }*/
    public int totalBonoDescuento() {
        return 0;
    }

    public int cantidadMediosAlojamiento() {
        return 0;
    }

    public int valorACancelar() {
        return 0;
    }

    public int incrementoValorBase() {
        for (int i = 0; i < alojamiento.size(); i++) {
            if (alojamiento.get(i) instanceof Cabagna) {
                incrementoValorBase();

            }
        }
        return 0;
    }
}

