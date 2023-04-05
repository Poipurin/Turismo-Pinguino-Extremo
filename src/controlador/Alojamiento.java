package controlador;

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
}
