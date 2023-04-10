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

    public int buscarCliente(String rut){
        String RutCliente = "";
        for(int i=0; i <  alojamiento.size(); i++){
            if(alojamiento.get(i).getDatosCliente().getRut().compareToIgnoreCase(rut)==0){
                return i;
            }
        }
        return -1;
    }

    public void ingresarCarpa(Carpa carpa){
        if(buscarCliente(carpa.getDatosCliente().getRut())==-1){
            alojamiento.add(carpa);
        }
    }

    public void ingresarCabagna(Cabagna cabagna){
        if(buscarCliente(cabagna.getDatosCliente().getRut())==-1){
            alojamiento.add(cabagna);
        }
    }

    public void ingresarHotel(Hotel hotel){
        if(buscarCliente(hotel.getDatosCliente().getRut())==-1){
            alojamiento.add(hotel);
        }
    }

    public String mostrarAlojamientos(){
        String mensaje = "";
        Carpa carpa = null;
        Cabagna cabagna = null;
        Hotel hotel = null;
        int contador = 0;
        for(int i=0; i < alojamiento.size();i++){
            if(alojamiento.get(i) instanceof Carpa){
                carpa = (Carpa) alojamiento.get(i);
                mensaje = mensaje + "\n El medio de alojamiento es: Carpa" + "\n Cliente: "+carpa.getDatosCliente().getNombre()+ "\n Rut asociado al cliente: " + carpa.getDatosCliente().getRut() + "\n Valor base por noche: $" +carpa.getValorBaseNoche()+ "\n Cantidad de noches: " +carpa.getCantidadDeNoches()+ "\n Temporada: " +carpa.getTipoTemporada()+"\n Cantidad de personas: " +carpa.getCantidadPersonas() +"\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░";
                contador++;
            }else if(alojamiento.get(i) instanceof Cabagna){
                cabagna = (Cabagna) alojamiento.get(i);
                mensaje = mensaje + "\n El medio de alojamiento es: Cabaña" + "\n Cliente: "+cabagna.getDatosCliente().getNombre()+ "\n Rut asociado al cliente: " + cabagna.getDatosCliente().getRut() + "\n Valor base por noche: $" +cabagna.getValorBaseNoche()+ "\n Cantidad de noches: " +cabagna.getCantidadDeNoches()+ "\n Temporada: " +cabagna.getTipoTemporada()+"\n Capacidad: " + cabagna.getCapacidad()+ "\n Es fumador: "+ cabagna.getEsFumador()+"\n Con Chimenea: "+cabagna.getConChimenea() +"\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░";
                contador++;
            } else if (alojamiento.get(i) instanceof Hotel) {
                hotel = (Hotel) alojamiento.get(i);
                mensaje = mensaje + "\n El medio de alojamiento es: Hotel" + "\n Cliente: "+hotel.getDatosCliente().getNombre()+ "\n Rut asociado al cliente: " + hotel.getDatosCliente().getRut() + "\n Valor base por noche: $" +hotel.getValorBaseNoche()+ "\n Cantidad de noches: " +hotel.getCantidadDeNoches()+ "\n Temporada: " +hotel.getTipoTemporada()+"\n Capacidad: " + hotel.getCapacidad()+ "\n Es fumador: "+ hotel.getEsFumador()+"\n Con desayuno: "+hotel.getConDesayuno() +"\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░";
                contador++;
            }
        }
        if(contador == 0)
            System.out.println("No hay alojamientos registrados");
        return mensaje;
    }
}

