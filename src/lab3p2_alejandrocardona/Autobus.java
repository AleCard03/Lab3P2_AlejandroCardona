
package lab3p2_alejandrocardona;

import java.awt.Color;
import java.util.Date;

public class Autobus extends Vehiculo{
    
    private int capacidad;
    private int numEjes;
    private double longitud;

    public Autobus(int capacidad, int numEjes, double longitud, String placa, String marca, String modelo, String tipo, Date año, Color color) {
        super(placa, marca, modelo, tipo, año, color);
        this.capacidad = capacidad;
        this.numEjes = numEjes;
        this.longitud = longitud;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        
        return super.toString()+"Autobus\n" + "capacidad: " + capacidad + "\nnumEjes: " + numEjes + "\nlongitud: " + longitud;
    }
    
    
    
}
